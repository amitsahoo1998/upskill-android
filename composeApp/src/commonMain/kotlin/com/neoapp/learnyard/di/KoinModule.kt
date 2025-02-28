package com.neoapp.learnyard.di


import com.neoapp.learnyard.data.datasource.remote.LoginApiService
import com.neoapp.learnyard.data.datasource.remote.impl.LoginApiServiceImpl
import com.neoapp.learnyard.domain.repository.LoginRepository
import com.neoapp.learnyard.data.repository.LoginRepositoryImpl
import com.neoapp.learnyard.presenter.ui.viewmodels.LoginViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module


fun initKoin(config: KoinAppDeclaration? = null){
    startKoin{
        config?.invoke(this)
        modules(
            provideNetworkModule,
            provideDataSourceModule,
            provideRepositoryModule,
            provideViewModelModule
        )
    }
}

val provideViewModelModule = module {
    viewModelOf(::LoginViewModel)
}

val provideRepositoryModule = module {
    singleOf(::LoginRepositoryImpl).bind(LoginRepository::class)
}

val provideDataSourceModule = module {
    singleOf(::LoginApiServiceImpl).bind(LoginApiService::class)
}

val provideNetworkModule = module {
    single { createJson() }
    single { createHttpClient(get(), true) }
}

fun createJson() = Json { isLenient = true ; ignoreUnknownKeys = true }

fun createHttpClient(json: Json , enableNetworkLogs: Boolean) = HttpClient {
    install(ContentNegotiation){
        json(json)
    }
    if (enableNetworkLogs){
        install(Logging){
            logger = Logger.DEFAULT
            level = LogLevel.BODY
        }
    }
}