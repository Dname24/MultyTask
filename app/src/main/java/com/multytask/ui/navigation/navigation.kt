package com.multytask.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.multytask.ui.screens.*
import com.multytask.viewmodel.TaskViewModel

@Composable
fun NavGraph(navController: NavHostController, taskViewModel: TaskViewModel = viewModel()) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("task_list") },
                onNavigateToRegister = { navController.navigate("register") }
            )
        }

        composable("register") {
            RegisterScreen(
                onRegisterSuccess = { navController.navigate("task_list") },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        composable("task_list") {
            TaskListScreen(
                taskViewModel = taskViewModel,
                navController = navController,
                onLogout = {
                    navController.navigate("login") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }

        composable("add_task") {
            AddTaskScreen(
                taskViewModel = taskViewModel,
                navController = navController,
                onCancel = { navController.popBackStack() }
            )
        }
    }
}