package com.kmm.apps.dailynewsapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform