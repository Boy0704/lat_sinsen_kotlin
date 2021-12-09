package com.apps.sinsenlat1.ui.form.list

import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.injection.anotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class VisitListModule {
    @Binds
    @IntoMap
    @ViewModelKey(VisitListViewModel::class)
    abstract fun bindViewModel(visitListViewModel: VisitListViewModel): ViewModel
}