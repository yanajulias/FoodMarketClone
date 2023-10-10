package aej.android.enthusiast.foodmarketclone.domain.mapper

import aej.android.enthusiast.foodmarketclone.domain.model.User
import aej.android.enthusiast.foodmarketclone.frameworks.model.response.AuthDto

fun AuthDto.UserDto?.toUser(): User {
    return User(
        address = this?.address.orEmpty(),
        city = this?.city.orEmpty(),
        email = this?.email.orEmpty(),
        houseNumber = this?.houseNumber.orEmpty(),
        id = this?.id ?: 0,
        name = this?.name.orEmpty(),
        phoneNumber = this?.phoneNumber.orEmpty()
    )
}