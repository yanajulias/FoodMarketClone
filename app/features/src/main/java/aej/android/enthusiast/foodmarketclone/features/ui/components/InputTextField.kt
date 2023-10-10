package aej.android.enthusiast.foodmarketclone.features.ui.components

import aej.android.enthusiast.foodmarketclone.features.ui.theme.FoodMarketCloneTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    label: String = "",
    placeholder: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onValueChange: (String) -> Unit
) {
    val text = remember { mutableStateOf(value) }

    Column(modifier = modifier) {
        Text(text = label, fontSize = 12.sp)
        OutlineTextField(
            placeholder = placeholder,
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChange.invoke(it)
            },
            keyboardOptions = keyboardOptions
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InputTextPreview() {
    FoodMarketCloneTheme {
        InputTextField(
            label = "Nama",
            placeholder = "Ini text",
            onValueChange = {}
        )
    }
}