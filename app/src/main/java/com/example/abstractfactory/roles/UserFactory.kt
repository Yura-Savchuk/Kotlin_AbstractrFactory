package com.example.abstractfactory.roles

import com.example.abstractfactory.factory.AbstractFactory
import com.example.abstractfactory.factory.Content
import com.example.abstractfactory.factory.Title

/**
 * Created by {@author coulcod} on 30.04.17.
 */

class UserFactory: AbstractFactory() {

    override fun createTitle(): Title {
        return UserTitle()
    }

    override fun createContent(): Content {
        return UserContent()
    }

}