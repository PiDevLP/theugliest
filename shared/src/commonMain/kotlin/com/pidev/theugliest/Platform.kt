package com.pidev.theugliest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform