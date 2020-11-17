package com.solar.architecture.pattern.observer

import androidx.appcompat.app.AppCompatActivity

class ObserverPatternActivity : AppCompatActivity() {

    fun init() {
        val youtuber = Youtuber()
        val old = YoutubeOldUser()
        val new = YoutubeNewUser()

        youtuber.run {
            registerObserver(old)
            registerObserver(new)
        }

        youtuber.notifyObserversNewVideo()
    }
}