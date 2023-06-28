package com.gaan.testkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform