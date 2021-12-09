package com.apps.sinsenlat1.ui.print

import android.os.Bundle
import android.widget.*
import com.apps.sinsenlat1.R
import com.apps.sinsenlat1.ui.base.BaseActivity

class PrintActivity : BaseActivity<PrintViewModel>() {

    private lateinit var btPrint: BtPrint
    private lateinit var printSwitch: Switch
    private lateinit var printLoading: ProgressBar
    private lateinit var printInfo: TextView
    private lateinit var transactionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print)

        // Init and pass the Views

        printSwitch = findViewById(R.id.printSwitch)
        printLoading = findViewById(R.id.printLoading)
        printInfo = findViewById(R.id.printInfo)
        transactionButton = findViewById(R.id.transactionButton)

        btPrint = BtPrint( printSwitch, printLoading, printInfo, transactionButton )


        // Actual print

        transactionButton.setOnClickListener{


            // We do socket connect here so we can do some handling if something happen with the printer before
            // the actual printing.

            btPrint.socketConnect { result ->

                if ( result["success"] == false ){

                    this@PrintActivity.runOnUiThread {

                        printInfo.text = result["text"].toString()
                        printSwitch.isChecked = false

                        Toast.makeText(this, "OOPS!!!", Toast.LENGTH_SHORT).show()

                        // TODO: Pooling?

                    }

                } else {

                    btPrint.doPrint( android.os.Build.MODEL + "\n", true )
                    btPrint.doPrint( android.os.Build.BRAND + "\n\n\n" )


                    // I'll share how I handle printing format for regular receipts next... :)

                }

            }

        }

    }
}