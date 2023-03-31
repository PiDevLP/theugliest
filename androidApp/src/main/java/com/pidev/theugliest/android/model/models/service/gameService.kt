package com.example.base_app_kotlin_multi.android.model.models.service

import com.example.base_app_kotlin_multi.android.model.models.gameLogic.Session
import com.example.base_app_kotlin_multi.android.model.models.roles.Player
import java.util.*
import kotlin.collections.AbstractList

class gameService {

    fun createSession(name: String): Session {
        val session = Session(listOf<Player>() as AbstractList<Player>, listOf<ByteArray>() as AbstractList<ByteArray>)
        return session
    }


}