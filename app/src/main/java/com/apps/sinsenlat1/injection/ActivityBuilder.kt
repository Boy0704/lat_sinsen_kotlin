package com.apps.sinsenlat1.injection

import com.apps.sinsenlat1.ui.barcode.BarcodeActivity
import com.apps.sinsenlat1.ui.barcode.BarcodeModule
import com.apps.sinsenlat1.ui.form.input.FormInputActivity
import com.apps.sinsenlat1.ui.form.input.FormInputModule
import com.apps.sinsenlat1.ui.form.list.VisitListActivity
import com.apps.sinsenlat1.ui.form.list.VisitListModule
import com.apps.sinsenlat1.ui.form.output.FormOutputActivity
import com.apps.sinsenlat1.ui.form.output.FormOutputModule
import com.apps.sinsenlat1.ui.login.LoginActivity
import com.apps.sinsenlat1.ui.login.LoginModule
import com.apps.sinsenlat1.ui.print.PrintActivity
import com.apps.sinsenlat1.ui.print.PrintModule
import com.apps.sinsenlat1.ui.splash.SplashActivity
import com.apps.sinsenlat1.ui.splash.SplashModule
import com.apps.sinsenlat1.ui.webviewprint.PrintWebViewActivity
import com.apps.sinsenlat1.ui.webviewprint.WebviewPrintModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = [FormInputModule::class])
    abstract fun bindFormInputActivity(): FormInputActivity

    @ContributesAndroidInjector(modules = [FormOutputModule::class])
    abstract fun bindFormOutputActivity(): FormOutputActivity

    @ContributesAndroidInjector(modules = [VisitListModule::class])
    abstract fun bindVisitListActivity(): VisitListActivity

    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [BarcodeModule::class])
    abstract fun bindBarcodeActivity(): BarcodeActivity

    @ContributesAndroidInjector(modules = [PrintModule::class])
    abstract fun bindPrintActivity(): PrintActivity

    @ContributesAndroidInjector(modules = [WebviewPrintModule::class])
    abstract fun bindPrintWebViewActivity(): PrintWebViewActivity


}