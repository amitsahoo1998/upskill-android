package com.neoapp.learnyard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform