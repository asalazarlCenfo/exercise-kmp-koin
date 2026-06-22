package io.github.kevinah95.kmpkoin

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.kevinah95.kmpkoin.data.UserViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
@OptIn(org.koin.core.annotation.KoinExperimentalAPI::class)
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val userViewModel = koinViewModel<UserViewModel>()
        Column(
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = userViewModel.getGreeting()
                val users = userViewModel.getUsers()

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Compose: $greeting")

                    LazyColumn {
                        items(users) { user ->
                            Text("${user.name} - ${user.email}")
                        }
                    }
                }
            }
        }
    }
}
