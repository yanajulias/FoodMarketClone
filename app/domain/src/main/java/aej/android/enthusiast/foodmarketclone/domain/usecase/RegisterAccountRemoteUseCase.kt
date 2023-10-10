package aej.android.enthusiast.foodmarketclone.domain.usecase

import aej.android.enthusiast.foodmarketclone.common.UiResult
import aej.android.enthusiast.foodmarketclone.domain.model.User
import kotlinx.coroutines.flow.Flow

interface RegisterAccountRemoteUseCase {
    suspend fun registerAccount(
        name: String,
        email: String,
        phoneNumber: String,
        address: String,
        houseNumber: String,
        city: String,
        password: String
    ): Flow<UiResult<User>>
}
