package aej.android.enthusiast.foodmarketclone.common

import retrofit2.HttpException
import java.io.IOException

suspend fun <T> safeApiCall(block: suspend () -> T): NetworkResult<T> {
    return try {
        NetworkResult.Success(block.invoke())
    } catch (throwable: Throwable) {
        when (throwable) {
            is IOException -> {
                NetworkResult.Failure(ConnectivityException())
            }

            is HttpException -> {
                when (throwable.code()) {
                    in 300..599 -> {
                        //NetworkResult.Failure(NetworkClientException())
                    }
                }
                NetworkResult.Failure(UnexpectedValuesRepresentation())
            }

            else -> {
                NetworkResult.Failure(throwable)
            }
        }
    }
}