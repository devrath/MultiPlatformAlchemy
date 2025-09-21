package org.sample.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform