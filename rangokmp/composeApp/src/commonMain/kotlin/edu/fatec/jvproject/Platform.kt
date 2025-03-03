package edu.fatec.jvproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform