package com.msiazn.foundationapp.data.services

import com.msiazn.foundationapp.data.database.daos.CustomerDao
import javax.inject.Inject

class CustomerLocalService @Inject constructor(private val customerDao: CustomerDao) {
}