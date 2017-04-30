package com.example.abstractfactory.factory

import com.example.abstractfactory.roles.AdminFactory

/**
 * Created by {@author coulcod} on 30.04.17.
 */

abstract class AbstractFactory {

    abstract fun createTitle(): Title
    abstract fun createContent(): Content

}