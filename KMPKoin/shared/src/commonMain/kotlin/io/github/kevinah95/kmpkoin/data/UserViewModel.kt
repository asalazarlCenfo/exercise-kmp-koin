package io.github.kevinah95.kmpkoin.data

import androidx.lifecycle.ViewModel

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun getGreeting(): String = "Hello, ${userRepository.getUsers().firstOrNull()?.name ?: "Guest"}!"
    fun getUsers() = userRepository.getUsers()
}