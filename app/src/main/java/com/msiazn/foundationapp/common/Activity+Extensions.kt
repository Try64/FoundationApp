package com.msiazn.foundationapp.common

import android.app.Activity
import com.msiazn.foundationapp.CustomApplication

val Activity.customApplication: CustomApplication
get() = application as CustomApplication