package com.example.daggerhiltsample.data.repository

import android.app.Application
import com.example.daggerhiltsample.R
import com.example.daggerhiltsample.data.remote.MyApi
import com.example.daggerhiltsample.domain.repository.MyRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application,
    //private val hello1: String

): MyRepository {

    init{
        val appName = appContext.getString(R.string.app_name)
        //println("hello from the repository. the app name is $appName with $hello1")
        println("hello from the repository. the app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}