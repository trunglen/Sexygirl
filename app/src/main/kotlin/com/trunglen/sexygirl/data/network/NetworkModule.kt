package com.trunglen.sexygirl.data.network

import android.content.Context
import android.net.ConnectivityManager
import dagger.Module
import dagger.Provides
import com.trunglen.sexygirl.ApplicationQualifier
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides @Singleton
    fun provideConnectivityManager(@ApplicationQualifier context: Context): ConnectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    @Provides @Singleton
    fun provideNetworkInteractor(networkInteractorImpl: NetworkInteractorImpl): NetworkInteractor = networkInteractorImpl

}