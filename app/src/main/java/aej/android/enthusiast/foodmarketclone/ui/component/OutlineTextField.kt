package aej.android.enthusiast.foodmarketclone.ui.component

import aej.android.enthusiast.foodmarketclone.theme.FoodMarketCloneTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OutlineTextField(
    modifier: Modifier = Modifier,
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
) {
    val focusManager = LocalFocusManager.current

    BasicTextField(
        modifier = modifier.fillMaxWidth(),
        onValueChange = onValueChange,
        value = value,
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 16.sp
        ),
        decorationBox = { textField ->
            Column {
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp, horizontal = 6.dp)
                ) {
                    if (value.isEmpty()) {
                        Text(
                            text = placeholder,
                            color = Color.Gray,
                            fontSize = 16.sp
                        )
                    }
                    textField()
                }
                HorizontalDivider(thickness = 2.dp, color = Color.Gray)
            }
        },
        keyboardActions = KeyboardActions(
            onDone = {
                focusManager.clearFocus()
            }
        ),
        maxLines = 1,
        singleLine = true,
        keyboardOptions = keyboardOptions
    )
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    FoodMarketCloneTheme {
        OutlineTextField(
            placeholder = "Nama",
            value = "Text",
            onValueChange = {},
            keyboardOptions = KeyboardOptions()
        )
    }
}