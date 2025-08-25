package com.multytask

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    onLogout: () -> Unit,
    onGoToTasks: () -> Unit,
    onAddTask: () -> Unit
) {
    Column {
        Button(onClick = onGoToTasks) {
            Text("Ver tareas")
        }

        Button(onClick = onAddTask) {
            Text("Agregar tarea")
        }

        Button(onClick = onLogout) {
            Text("Cerrar sesión")
        }
    }
}
