package dev.seabat.android.screenshot2cloud.ui.compose

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.seabat.android.screenshot2cloud.ui.compose.screens.home.HomeScreen

@Composable
fun Screenshot2CloudApp() {
    val navController = rememberNavController()
    AppNavHost(
        navController = navController
    )
}

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    val activity = (LocalContext.current as Activity)
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
    }
}

