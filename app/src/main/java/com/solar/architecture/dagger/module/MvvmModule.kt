package com.solar.architecture.dagger.module

import com.solar.architecture.Code
import com.solar.architecture.CodeOne
import com.solar.architecture.CodeTwo
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MvvmModule {

    @Provides
    @Named("Msg1")
    fun provideMsg1() : String = "Msg1!"

    @Provides
    @Named("Msg2")
    fun provideMsg2() : String = "Msg2!"

    @Provides
    @Named("CodeOne")
    fun provideCodeOne(): Code = CodeOne()

    @Provides
    @Named("CodeTwo")
    fun provideCodeTwo(): Code = CodeTwo()
}