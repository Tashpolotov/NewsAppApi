package com.example.newsapp

import android.content.Context
import com.example.common_utils.Navigator
import com.example.news_data.room.NewsDAO
import com.example.newsapp.navigation.DefaultNavigator
import com.example.newsapp.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object MainModule {

        @Provides
        @Singleton
        fun providerProvider() : Navigator.Provider{
            return DefaultNavigator()
        }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context):AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideNewsDAO(appDatabase: AppDatabase):NewsDAO{
        return appDatabase.getNewsDao()
    }

}