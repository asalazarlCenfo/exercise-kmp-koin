package io.github.kevinah95.kmpkoin

import android.app.Application
import io.github.kevinah95.kmpkoin.di.initKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}