package com.solar.architecture.dagger

import com.solar.architecture.dagger.component.AppComponent
import com.solar.architecture.dagger.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class Dagger2Application : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }


    companion object {
        lateinit var appComponent: AppComponent
    }
}