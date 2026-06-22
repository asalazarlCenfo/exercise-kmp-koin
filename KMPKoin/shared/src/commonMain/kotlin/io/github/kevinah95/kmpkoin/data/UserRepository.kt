package io.github.kevinah95.kmpkoin.data

class UserRepository {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUsers(): List<User> = users
}