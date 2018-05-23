package com.trunglen.sexygirl.ui.list

import dagger.Subcomponent
import com.trunglen.sexygirl.ui.ActivityScope

@ActivityScope
@Subcomponent(modules = arrayOf(
        ListModule::class
))
interface ListComponent {

    fun injectTo(activity: ListActivity)
}