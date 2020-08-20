package com.solar.architecture

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.solar.architecture.dagger.Dagger2Application
import com.solar.architecture.dagger.component.DaggerActivityComponent
import com.solar.architecture.mvvm.view.MvvmActivity
import com.solar.architecture.mvvm.viewmodel.BasicViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var viewModel: BasicViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerActivityComponent.builder()
            .appComponent(Dagger2Application.appComponent)
            .build()

        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.title.observe(this, Observer {
            hello_world.text = it
        })
        viewModel.getSample()

        hello_world.setOnClickListener {
            startActivity(Intent(this, MvvmActivity::class.java))
        }
    }
}