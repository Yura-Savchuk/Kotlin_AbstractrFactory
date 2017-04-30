package com.example.abstractfactory.factory

import android.content.Context
import android.support.graphics.drawable.VectorDrawableCompat

/**
 * Created by {@author coulcod} on 30.04.17.
 */
interface Content {

    fun getImage(context: Context): VectorDrawableCompat

}