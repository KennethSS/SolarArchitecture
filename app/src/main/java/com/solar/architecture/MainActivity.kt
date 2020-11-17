package com.solar.architecture

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solar.architecture.db.room.RoomActivity
import com.solar.architecture.mvp.view.MvpActivity
import com.solar.architecture.mvvm.view.MvvmActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var s = "asldk"

        val char = s.toCharArray()

        char.sorted()

        char.sorted().joinToString("")


        mvvm.setOnClickListener { startActivity(Intent(this, MvvmActivity::class.java)) }
        mvp.setOnClickListener { startActivity(Intent(this, MvpActivity::class.java)) }
        room.setOnClickListener { startActivity(Intent(this, RoomActivity::class.java)) }
    }
}