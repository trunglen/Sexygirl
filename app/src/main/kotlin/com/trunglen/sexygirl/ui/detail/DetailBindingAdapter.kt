package com.trunglen.sexygirl.ui.detail

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.trunglen.sexygirl.extensions.loadImage

@BindingAdapter("android:src")
fun setImageBinding(view: ImageView, url: String){
    view.loadImage(url)
}