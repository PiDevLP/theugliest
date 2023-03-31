package com.example.base_app_kotlin_multi.android.model.models.roles

import com.example.base_app_kotlin_multi.android.model.models.gameLogic.Session
import java.util.UUID
import kotlin.properties.Delegates

open class Player (val id: UUID, name: String, val session: Session) {

    lateinit var playerSelected: Player
    var position by Delegates.notNull<Int>()
    lateinit var image: ByteArray


}