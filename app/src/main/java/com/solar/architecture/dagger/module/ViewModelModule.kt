package com.solar.architecture.dagger.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.solar.architecture.mvvm.viewmodel.BasicViewModel
import com.solar.architecture.mvvm.viewmodel.MvvmViewModel
import com.solar.domain.repository.FoodRepository
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class ViewModelModule {

    @Provides
    @IntoMap
    @ViewModelKey(MvvmViewModel::class)
    fun provideMvvmViewModel(): ViewModel {
        return MvvmViewModel()
    }


//    @Provides
//    @IntoMap
//    @ViewModelKey(BasicViewModel::class)
//    fun provideBasicViewModel(repository: FoodRepository): ViewModel {
//        return BasicViewModel(repository)
//    }
}