package com.example.kmp

import androidx.compose.runtime.Composable

class DesktopPlatform : Platform {
    override val name: String = "Desktop"
}

actual fun getPlatform(): Platform = DesktopPlatform()

@Composable
fun Application(){
    App()
}