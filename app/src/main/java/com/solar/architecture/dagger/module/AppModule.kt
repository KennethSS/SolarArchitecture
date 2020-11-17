package com.solar.architecture.dagger.module

import android.app.Application
import android.content.Context
import com.solar.domain.repository.FoodRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application
}