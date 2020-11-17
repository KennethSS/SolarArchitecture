package com.solar.architecture.mvvm.view

import androidx.fragment.app.activityViewModels
import com.solar.architecture.R
import com.solar.architecture.databinding.FragmentSampleBinding
import com.solar.architecture.databinding.FragmentSampleBindingImpl
import com.solar.architecture.fragment.BaseFragment
import com.solar.architecture.mvvm.viewmodel.BasicViewModel

class MvvmFragment : BaseFragment<BasicViewModel, FragmentSampleBinding>(
    R.layout.fragment_sample,
    BasicViewModel::class.java
) {

    val scheduleViewModel: BasicViewModel by activityViewModels()

}