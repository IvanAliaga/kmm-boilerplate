package com.boilerplate.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform