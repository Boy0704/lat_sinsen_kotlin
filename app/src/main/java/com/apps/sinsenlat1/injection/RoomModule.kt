package com.apps.sinsenlat1.injection

import android.content.Context
import com.apps.sinsenlat1.data.room.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class RoomModule {

    companion object {
        @JvmStatic
        @Singleton
        @Provides
        fun provideDatabase(context: Context) = AppDatabase.getDatabase(context)

        @JvmStatic
        @Singleton
        @Provides
        fun provideVisitDao(database: AppDatabase) = database.visitDao()
    }
}