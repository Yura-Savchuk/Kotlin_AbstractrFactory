package com.example.abstractfactory.roles

import android.content.Context
import android.support.graphics.drawable.VectorDrawableCompat
import com.example.abstractfactory.R
import com.example.abstractfactory.factory.Content

/**
 * Created by {@author coulcod} on 30.04.17.
 */
class AdminContent: Content {

    override fun getImage(context: Context): VectorDrawableCompat {
        return VectorDrawableCompat.create(context.resources, R.drawable.vector_admin, null) as VectorDrawableCompat
    }

}