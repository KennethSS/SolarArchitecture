package com.solar.architecture.mvvm.view

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.solar.architecture.Code
import com.solar.architecture.CodeOne
import com.solar.architecture.CodeTwo
import com.solar.architecture.R
import com.solar.architecture.dagger.User
import com.solar.architecture.databinding.ActivityMvvmBinding
import com.solar.architecture.mvvm.viewmodel.BasicViewModel
import com.solar.architecture.mvvm.viewmodel.MvvmViewModel
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named


class MvvmActivity : DaggerAppCompatActivity(){


    @Inject
    @field:Named("Msg2")
    lateinit var msg: String

    @Inject
    @field:Named("CodeOne")
    lateinit var code: Code

    @Inject
    lateinit var mvvmViewModel: MvvmViewModel

    private lateinit var bind: ActivityMvvmBinding

    /*@Inject
    lateinit var viewModel: BasicViewModel*/

    //private const val JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"

    /*val ViewModel.viewModelScope: CoroutineScope
        get() {
            val scope: CoroutineScope? = getTag(JOB_KEY)

        }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        /*val component = DaggerActivityComponent.builder()
            .appComponent(Dagger2Application.appComponent)
            .build()

        component.inject(this)*/
        super.onCreate(savedInstanceState)

        val user1 = User("Kenneth", "https://store.image/profile_1", 30)
        val user2 = User("Kenneth", "https://store.image/profile_1", 30)


        Log.d("equals", (user1 === user2).toString())
        Log.d("equals", (user1 == user2).toString())


        Log.d("user1", user1.toString())
        Log.d("user2", user2.toString())
        Log.d("user1", user1.hashCode().toString())
        Log.d("user2", user2.hashCode().toString())


        bind = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)

        bind.text = msg
        when(code) {
            is CodeOne -> {
                Log.d("CodeOne", "CodeOne")
            }
            is CodeTwo -> {
                Log.d("CodeTwo", "CodeTwo")
            }
        }

        bind.text = mvvmViewModel.getSample()
        /*viewModel.title.observe(this, Observer {
            bind.text = it
        })
        viewModel.getSample()*/
    }
}