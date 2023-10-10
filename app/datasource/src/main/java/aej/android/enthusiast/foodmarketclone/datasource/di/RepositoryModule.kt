package aej.android.enthusiast.foodmarketclone.datasource.di

import aej.android.enthusiast.foodmarketclone.datasource.repository.AuthRepository
import aej.android.enthusiast.foodmarketclone.datasource.repository.AuthRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindAuthRepository(authRepositoryImpl: AuthRepositoryImpl): AuthRepository
}