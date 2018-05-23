package com.trunglen.sexygirl.ui.detail

import dagger.Subcomponent
import com.trunglen.sexygirl.ui.ActivityScope

@ActivityScope
@Subcomponent(modules = arrayOf(
        DetailModule::class
))
interface DetailComponent {
    fun injectTo(activity: DetailActivity)
}