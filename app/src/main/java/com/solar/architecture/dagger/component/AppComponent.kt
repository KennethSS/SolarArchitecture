package com.solar.architecture.dagger.component

import android.app.Application
import com.solar.architecture.dagger.Dagger2Application
import com.solar.architecture.dagger.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityProvider::class,
        AppModule::class,
        MvvmModule::class,
        ViewModelModule::class
        /*
        ViewModelFactoryModule::class,
        PresenterModule::class,
        RemoteModule::class,
        DomainModule::class*/
    ]
)
interface AppComponent : AndroidInjector<Dagger2Application>{

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}