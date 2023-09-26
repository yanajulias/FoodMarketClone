package aej.android.enthusiast.foodmarketclone.domain.usecase

import aej.android.enthusiast.foodmarketclone.common.UiResult
import aej.android.enthusiast.foodmarketclone.domain.model.User
import kotlinx.coroutines.flow.Flow

interface LoginAccountRemoteUseCase {
    suspend fun loginAccount(email: String, password: String): Flow<UiResult<User>>
}