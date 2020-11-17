package com.solar.architecture.pattern.observer

class YoutubeNewUser : Observer {
    override fun newVideo() {
        pushToUserForNewVideo()
    }

    private fun pushToUserForNewVideo() {

    }
}