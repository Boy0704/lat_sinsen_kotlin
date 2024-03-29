package com.apps.sinsenlat1.ui.form.output

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.view.children
import com.apps.sinsenlat1.R
import com.apps.sinsenlat1.data.constant.Constants
import com.apps.sinsenlat1.ui.base.BaseActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class FormOutputActivity : BaseActivity<FormOutputViewModel>()  {

    private lateinit var inputLocation: TextView
    private lateinit var datePicker: TextView
    private lateinit var timePicker: TextView
    private lateinit var checkAcc1: CheckBox
    private lateinit var checkAcc2: CheckBox
    private lateinit var checkAcc3: CheckBox
    private lateinit var radioType: RadioGroup
    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_output)

        inputLocation = findViewById(R.id.input_location)
        datePicker = findViewById(R.id.date_picker)
        timePicker = findViewById(R.id.time_picker)
        checkAcc1 = findViewById(R.id.check_acc1_o)
        checkAcc2 = findViewById(R.id.check_acc2_o)
        checkAcc3 = findViewById(R.id.check_acc3_o)
        radioType = findViewById(R.id.radio_type_o)
        ratingBar = findViewById(R.id.rating_bar)

        val valueLocation = intent.getStringExtra(Constants.INTENT.KEY_LOCATION)
        val valueDate = intent.getStringExtra(Constants.INTENT.KEY_DATE)
        val valueTime = intent.getStringExtra(Constants.INTENT.KEY_TIME)
        val valueAccessories = intent.getStringExtra(Constants.INTENT.KEY_ACC)
        val valueType = intent.getStringExtra(Constants.INTENT.KEY_TYPE)
        val valueRating = intent.getFloatExtra(Constants.INTENT.KEY_RATING, 0F)

        inputLocation.text = valueLocation
        datePicker.text = valueDate
        timePicker.text = valueTime

        val listAccessories = Gson().fromJson<List<String>>(valueAccessories, object : TypeToken<List<String>>(){}.type)
        listAccessories.forEach {
            if (checkAcc1.text == it) {
                checkAcc1.isChecked = true
            }
            if (checkAcc2.text == it) {
                checkAcc2.isChecked = true
            }
            if (checkAcc3.text == it) {
                checkAcc3.isChecked = true
            }
        }

        radioType.children.forEach {
            val radioButton = it as RadioButton
            radioButton.isChecked = radioButton.text == valueType
        }

        ratingBar.rating = valueRating
    }
}