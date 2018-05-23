package com.trunglen.sexygirl

import dagger.Component
import com.trunglen.sexygirl.data.network.NetworkModule
import com.trunglen.sexygirl.data.remote.ApiModule
import com.trunglen.sexygirl.ui.detail.DetailComponent
import com.trunglen.sexygirl.ui.detail.DetailModule
import com.trunglen.sexygirl.ui.list.ListComponent
import com.trunglen.sexygirl.ui.list.ListModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetworkModule::class,
        ApiModule::class
))
interface ApplicationComponent {

    // Injectors
    fun injectTo(app: KotlinBoilerplateApp)

    // Submodule methods
    // Every screen is its own submodule of the graph and must be added here.
    fun plus(module: ListModule): ListComponent
    fun plus(module: DetailModule): DetailComponent
}