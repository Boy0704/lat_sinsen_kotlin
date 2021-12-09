package com.apps.sinsenlat1.ui.form.input

import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.injection.anotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FormInputModule {
    @Binds
    @IntoMap
    @ViewModelKey(FormInputViewModel::class)
    abstract fun bindViewModel(viewModel: FormInputViewModel): ViewModel

}