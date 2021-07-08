package com.example.hilt.modules

import com.example.hilt.activity.main.Female
import com.example.hilt.activity.main.Male
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class MailModule {

    @Provides
    fun provideMaleGender() : Male{
        return Male()
    }

    @Provides
    fun provideFemaleGender() : Female{
        return Female()
    }
}