package io.github.kevinah95.kmpkoin.di

import io.github.kevinah95.kmpkoin.data.UserRepository
import io.github.kevinah95.kmpkoin.data.UserViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val dataModule = module {
    single { UserRepository() }
    viewModelOf(::UserViewModel)
}