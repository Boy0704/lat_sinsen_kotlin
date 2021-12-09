package com.apps.sinsenlat1.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.sinsenlat1.R
import com.apps.sinsenlat1.ui.base.BaseActivity
import com.apps.sinsenlat1.ui.form.input.FormInputActivity
import com.apps.sinsenlat1.ui.form.list.VisitListActivity
import com.apps.sinsenlat1.ui.login.LoginActivity
import com.apps.sinsenlat1.ui.print.PrintActivity
import com.apps.sinsenlat1.ui.webviewprint.PrintWebViewActivity

class SplashActivity : BaseActivity<SplashViewModel>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycle.addObserver(viewModel)
        observeData()
        viewModel.checkToken()

    }

    private fun observeData() {
        viewModel.splashNotifier.observe(this, {
            if (it) {
                val formIntent = Intent(this, LoginActivity::class.java)
                startActivity(formIntent)
                finish()
            }
        })
    }


}