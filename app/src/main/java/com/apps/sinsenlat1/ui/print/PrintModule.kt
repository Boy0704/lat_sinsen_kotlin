package com.apps.sinsenlat1.ui.print

import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.injection.anotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PrintModule {
    @Binds
    @IntoMap
    @ViewModelKey(PrintViewModel::class)
    abstract fun bindViewModel(viewModel: PrintViewModel): ViewModel

}