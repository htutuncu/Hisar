package com.example.hisar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hisar.AnimatedSplashScreen
import com.example.hisar.HomeScreen
import com.example.hisar.LoginScreen
import com.example.hisar.Screen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController)
        }
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen()
        }
        composable(
            route = Screen.Splash.route
        ) {
            AnimatedSplashScreen(navController)
        }
    }
}