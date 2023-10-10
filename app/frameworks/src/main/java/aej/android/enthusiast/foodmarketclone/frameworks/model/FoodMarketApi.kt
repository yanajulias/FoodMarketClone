package aej.android.enthusiast.foodmarketclone.frameworks.model

import aej.android.enthusiast.foodmarketclone.common.BaseResponse
import aej.android.enthusiast.foodmarketclone.frameworks.model.request.LoginRequest
import aej.android.enthusiast.foodmarketclone.frameworks.model.request.RegisterRequest
import aej.android.enthusiast.foodmarketclone.frameworks.model.response.AuthDto
import retrofit2.http.Body
import retrofit2.http.POST

interface FoodMarketApi {

    @POST("login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ): BaseResponse<AuthDto>

    @POST("register")
    suspend fun register(
        @Body registerRequest: RegisterRequest
    ): BaseResponse<AuthDto>
}