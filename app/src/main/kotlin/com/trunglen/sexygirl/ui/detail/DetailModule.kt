package com.trunglen.sexygirl.ui.detail

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import com.trunglen.sexygirl.data.remote.model.Repo
import com.trunglen.sexygirl.ui.base.ActivityModule

@Module
class DetailModule(activity: AppCompatActivity, val repo: Repo) : ActivityModule(activity) {

    @Provides
    fun provideRepo(): Repo = repo
}