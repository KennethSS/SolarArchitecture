package com.solar.architecture.dagger.module

import com.solar.architecture.dagger.scope.ActivityScope
import com.solar.architecture.mvvm.view.MvvmActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityProvider {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMvvmActivity() : MvvmActivity
}