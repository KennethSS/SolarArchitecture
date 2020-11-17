package com.solar.architecture.pattern.observer

interface Observable {
    fun registerObserver(observer: Observer) // attach, subscribe
    fun unregisterObserver(observer: Observer) // detach, unsubscribe
    fun notifyObserversNewVideo()
}