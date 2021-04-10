package com.example.dagger_hilt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("String1")
    fun provideString1()= "Hi I am using Dagger-Hilt"

    @Singleton
    @Provides
    @Named("String2")
    fun provideString2()= "Hi I am using Dagger-Hilt(2)"

}