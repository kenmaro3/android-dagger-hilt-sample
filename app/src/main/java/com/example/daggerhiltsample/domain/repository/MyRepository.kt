package com.example.daggerhiltsample.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}