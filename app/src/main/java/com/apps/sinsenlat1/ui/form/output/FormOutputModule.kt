package com.apps.sinsenlat1.ui.form.output

import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.injection.anotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FormOutputModule {
    @Binds
    @IntoMap
    @ViewModelKey(FormOutputViewModel::class)
    abstract fun bindViewModel(viewModel: FormOutputViewModel): ViewModel

}