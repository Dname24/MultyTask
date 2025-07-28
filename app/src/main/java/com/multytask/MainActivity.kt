package com.multytask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ui.screens.LoginScreen
import com.multytask.ui.theme.MultyTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultyTaskTheme {
                LoginScreen { email, password ->
                    println("Login con: $email / $password")
                }
            }
        }
    }
}
