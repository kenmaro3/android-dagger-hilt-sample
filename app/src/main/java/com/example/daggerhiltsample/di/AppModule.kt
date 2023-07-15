package com.example.daggerhiltsample.di

import android.app.Application
import com.example.daggerhiltsample.data.remote.MyApi
import com.example.daggerhiltsample.data.repository.MyRepositoryImpl
import com.example.daggerhiltsample.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Provides
    @Singleton
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(MyApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideMyRepository(api: MyApi, app: Application): MyRepository {
//        return MyRepositoryImpl(api = api, appContext = app)
//
//    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun providestring2() = "hello 2"


}