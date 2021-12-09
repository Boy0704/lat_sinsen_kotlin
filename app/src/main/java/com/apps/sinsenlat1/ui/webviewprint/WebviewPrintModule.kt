package com.apps.sinsenlat1.ui.webviewprint

import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.injection.anotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class WebviewPrintModule {
    @Binds
    @IntoMap
    @ViewModelKey(WebviewPrintViewModel::class)
    abstract fun bindViewModel(viewModel: WebviewPrintViewModel): ViewModel

}