package com.example.abstractfactory.roles

import com.example.abstractfactory.factory.AbstractFactory
import com.example.abstractfactory.factory.Content
import com.example.abstractfactory.factory.Title

/**
 * Created by {@author coulcod} on 30.04.17.
 */
class GuestFactory: AbstractFactory() {

    override fun createTitle(): Title {
        return GuestTitle()
    }

    override fun createContent(): Content {
        return GuestContent()
    }

}