package com.apps.sinsenlat1.injection

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.apps.sinsenlat1.api.ApiResponse
import com.apps.sinsenlat1.data.Session
import com.apps.sinsenlat1.ui.base.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {
    @Binds
    abstract fun provideContext(application: Application): Context

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    companion object {
        @JvmStatic
        @Provides
        @Singleton
        fun provideSession(context: Context) = Session(context)


        @JvmStatic
        @Provides
        fun provideApiResponse() = ApiResponse()

    }

}