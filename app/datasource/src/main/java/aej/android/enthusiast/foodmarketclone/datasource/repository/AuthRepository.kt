package aej.android.enthusiast.foodmarketclone.datasource.repository

import aej.android.enthusiast.foodmarketclone.common.BaseResponse
import aej.android.enthusiast.foodmarketclone.common.NetworkResult
import aej.android.enthusiast.foodmarketclone.frameworks.model.response.AuthDto

import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    suspend fun login(
        email: String,
        password: String
    ): Flow<NetworkResult<BaseResponse<AuthDto>>>

    suspend fun register(
        name: String,
        email: String,
        password: String,
        address: String,
        city: String,
        houseNumber: String,
        phoneNumber: String,
    ): Flow<NetworkResult<BaseResponse<AuthDto>>>
}