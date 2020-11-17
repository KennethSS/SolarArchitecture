package com.solar.architecture.pattern.observer

class Youtuber : Observable {

    private val observerList = arrayListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyObserversNewVideo() {
        observerList.forEach(Observer::newVideo)
    }
}