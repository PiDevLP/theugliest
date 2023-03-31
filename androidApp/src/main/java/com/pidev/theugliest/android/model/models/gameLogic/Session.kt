package com.example.base_app_kotlin_multi.android.model.models.gameLogic

import com.example.base_app_kotlin_multi.android.model.models.roles.Player
import java.util.*
import kotlin.collections.AbstractList

class Session(var playerList: AbstractList<Player>, var images: AbstractList<ByteArray>) {

    lateinit var playerTurn: Player

    fun definePlayerPosition() {

    }

    fun addPlayer(id: Long) {

    }

}