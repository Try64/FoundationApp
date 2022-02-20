package com.msiazn.foundationapp.data.services

import com.msiazn.foundationapp.data.apis.CustomerAPI
import javax.inject.Inject

class CustomerRemoteService @Inject constructor(private val customerAPI: CustomerAPI) {
}