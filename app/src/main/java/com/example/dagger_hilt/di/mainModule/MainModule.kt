package com.example.dagger_hilt.di.mainModule

import android.content.Context
import com.example.dagger_hilt.R
import dagger.Module
import dagger.Provides
import dagger.assisted.Assisted
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object MainModule {


    @Provides
    @ViewModelScoped
    @Named("StringMain")
    fun provideString3(
        @ApplicationContext context: Context,
        @Named("String1") string1:String
    )= " ${context.getString(R.string.main_string)} - $string1"
}