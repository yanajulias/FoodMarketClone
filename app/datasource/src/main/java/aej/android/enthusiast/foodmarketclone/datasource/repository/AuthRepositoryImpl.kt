package aej.android.enthusiast.foodmarketclone.datasource.repository

import aej.android.enthusiast.foodmarketclone.common.BaseResponse
import aej.android.enthusiast.foodmarketclone.common.NetworkResult
import aej.android.enthusiast.foodmarketclone.common.safeApiCall
import aej.android.enthusiast.foodmarketclone.frameworks.model.FoodMarketApi
import aej.android.enthusiast.foodmarketclone.frameworks.model.request.LoginRequest
import aej.android.enthusiast.foodmarketclone.frameworks.model.request.RegisterRequest
import aej.android.enthusiast.foodmarketclone.frameworks.model.response.AuthDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val foodMarketApi: FoodMarketApi
) : AuthRepository {

    override suspend fun login(
        email: String,
        password: String
    ): Flow<NetworkResult<BaseResponse<AuthDto>>> = flow {
        val loginRequest = LoginRequest(
            email = email,
            password = password
        )

        emit(safeApiCall {
            foodMarketApi.login(
                loginRequest
            )
        })
    }

    override suspend fun register(
        name: String,
        email: String,
        password: String,
        address: String,
        city: String,
        houseNumber: String,
        phoneNumber: String
    ): Flow<NetworkResult<BaseResponse<AuthDto>>> = flow {
        val registerRequest = RegisterRequest(
            name = name,
            email = email,
            password = password,
            passwordConfirmation = password,
            address = address,
            city = city,
            houseNumber = houseNumber,
            phoneNumber = phoneNumber
        )
        emit(safeApiCall {
            foodMarketApi.register(
                registerRequest
            )
        })
    }

}