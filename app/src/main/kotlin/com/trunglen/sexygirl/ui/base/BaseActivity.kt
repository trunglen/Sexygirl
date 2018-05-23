package com.trunglen.sexygirl.ui.base

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.trunglen.sexygirl.ApplicationComponent
import com.trunglen.sexygirl.KotlinBoilerplateApp

abstract class BaseActivity: AppCompatActivity() {

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        injectDependencies(KotlinBoilerplateApp.graph)
    }

    abstract fun injectDependencies(graph: ApplicationComponent)
}