package com.multytask.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.multytask.model.Task
import java.util.UUID

class TaskViewModel : ViewModel() {
    private val _tasks = mutableStateListOf<Task>()
    val tasks: List<Task> get() = _tasks

    fun addTask(title: String, description: String) {
        val task = Task(id = UUID.randomUUID().toString(), title = title, description = description)
        _tasks.add(task)
    }
}
