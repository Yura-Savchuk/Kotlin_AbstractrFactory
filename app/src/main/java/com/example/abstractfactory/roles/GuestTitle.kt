package com.example.abstractfactory.roles

import android.content.Context
import com.example.abstractfactory.R
import com.example.abstractfactory.factory.Title

/**
 * Created by {@author coulcod} on 30.04.17.
 */
class GuestTitle: Title {

    override fun getTitle(context: Context): String {
        return context.getString(R.string.guest_title)
    }

}