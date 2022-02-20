package com.msiazn.foundationapp.data.repositories

import com.msiazn.foundationapp.data.services.CustomerLocalService
import com.msiazn.foundationapp.data.services.CustomerRemoteService
import com.msiazn.foundationapp.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher

class CustomerRepository constructor(
    private val customerRemoteService: CustomerRemoteService,
    private val customerLocalService: CustomerLocalService,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {
}