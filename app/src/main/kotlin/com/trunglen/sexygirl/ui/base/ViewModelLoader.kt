package com.trunglen.sexygirl.ui.base

import android.content.Context
import android.support.v4.content.Loader
import com.trunglen.sexygirl.ui.ActivityScope
import javax.inject.Inject
import javax.inject.Provider

class ViewModelLoader<T : ViewModel> @Inject constructor(
        @ActivityScope context: Context,
        private val viewModelFactory: Provider<T>
) : Loader<T>(context) {

    private var viewModel: T? = null

    override fun onStartLoading() {
        super.onStartLoading()

        if (viewModel == null)
            forceLoad()
        else
            deliverResult(viewModel)
    }

    override fun onForceLoad() {
        super.onForceLoad()
        viewModel = viewModelFactory.get()

        deliverResult(viewModel)
    }

    override fun onReset() {
        super.onReset()

        viewModel?.onDestroy()
    }
}