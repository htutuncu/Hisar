package com.example.hisar

sealed class Screen(val route: String) {
    data object Splash: Screen(route = "splash_screen")
    data object Login: Screen(route = "login_screen")
    data object Home: Screen(route = "home_screen")
}