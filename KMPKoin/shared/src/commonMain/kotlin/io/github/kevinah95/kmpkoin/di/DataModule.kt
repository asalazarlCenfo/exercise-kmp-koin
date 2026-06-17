package io.github.kevinah95.kmpkoin.di

import io.github.kevinah95.kmpkoin.data.UserRepository
import org.koin.dsl.module

val dataModule = module {
    single { UserRepository() }
}