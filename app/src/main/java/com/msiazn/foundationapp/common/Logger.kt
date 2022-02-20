package com.msiazn.foundationapp.common

import android.util.Log
import com.msiazn.foundationapp.BuildConfig

object Logger {

    fun log(tag: String, message: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, message)
        }
    }

}