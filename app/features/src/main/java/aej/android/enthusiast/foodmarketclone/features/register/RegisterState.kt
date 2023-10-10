package aej.android.enthusiast.foodmarketclone.features.register

data class RegisterState(
    val name: String = "",
    val email: String = "",
    val password: String = "",
    val passwordConfirmation: String = "",
    val city: String = "",
    val address: String = "",
    val houseNumber: String = "",
    val phoneNumber: String = "",
    val isLoading: Boolean = false,
    val isRegister: Any? = null,
    val failedRegister: String = ""
)