package aej.android.enthusiast.foodmarketclone.domain.usecase

import aej.android.enthusiast.foodmarketclone.common.ConnectivityException
import aej.android.enthusiast.foodmarketclone.common.UiResult
import aej.android.enthusiast.foodmarketclone.common.UnexpectedValuesRepresentation
import aej.android.enthusiast.foodmarketclone.datasource.repository.AuthRepository
import aej.android.enthusiast.foodmarketclone.domain.mapper.toUser
import aej.android.enthusiast.foodmarketclone.domain.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RegisterAccountRemoteUseCaseImpl @Inject constructor(
    private val repository: AuthRepository
) : RegisterAccountRemoteUseCase {
    override suspend fun registerAccount(
        name: String,
        email: String,
        phoneNumber: String,
        address: String,
        houseNumber: String,
        city: String,
        password: String
    ): Flow<UiResult<User>> = flow {

        try {
            emit(UiResult.Loading())
            repository.register(
                name = name,
                email = email,
                phoneNumber = phoneNumber,
                address = address,
                houseNumber = houseNumber,
                city = city,
                password = password
            ).collect { result ->
                result.value?.data?.let { user ->
                    emit(UiResult.Success(user.userDto.toUser()))
                }
            }
        } catch (e: HttpException) {
            emit(UiResult.Failure(UnexpectedValuesRepresentation()))
        } catch (e: IOException){
            emit(UiResult.Failure(ConnectivityException()))
        }
    }
}