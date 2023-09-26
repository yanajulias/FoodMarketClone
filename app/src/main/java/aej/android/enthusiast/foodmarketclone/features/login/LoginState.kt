package aej.android.enthusiast.foodmarketclone.features.login

data class LoginState(
    val name: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val failedLogin: String = "",
    val isSignIn: Any? = null
)