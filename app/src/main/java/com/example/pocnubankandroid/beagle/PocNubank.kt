package com.example.pocnubankandroid.beagle

import android.app.Application

class PocNubank: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}