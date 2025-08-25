package com.multytask.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.multytask.model.Task
import kotlinx.coroutines.tasks.await

class TaskRepository {
    private val db = FirebaseFirestore.getInstance()
    private val tasksCollection = db.collection("tasks")

    suspend fun addTask(task: Task) {
        val docRef = tasksCollection.document()
        val taskWithId = task.copy(id = docRef.id)
        docRef.set(taskWithId).await()
    }
}