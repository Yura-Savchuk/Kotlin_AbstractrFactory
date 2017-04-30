package com.example.abstractfactory.factory

import com.example.abstractfactory.roles.AdminFactory
import com.example.abstractfactory.roles.GuestFactory
import com.example.abstractfactory.roles.UserFactory

/**
 * Created by {@author coulcod} on 30.04.17.
 */

fun getFactory(role: Role): AbstractFactory {
    when (role) {
        Role.ADMIN -> return AdminFactory()
        Role.USER -> return UserFactory()
        Role.GUEST -> return GuestFactory()
        else -> throw RuntimeException("Unexpected role.")
    }
}