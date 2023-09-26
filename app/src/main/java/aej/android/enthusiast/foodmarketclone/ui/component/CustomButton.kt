package aej.android.enthusiast.foodmarketclone.ui.component

import aej.android.enthusiast.foodmarketclone.R
import aej.android.enthusiast.foodmarketclone.theme.FoodMarketCloneTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.green_button)),
        onClick = onClick
    ) {
        Text(text = text)

    }
}

@Composable
@Preview(showBackground = true)
private fun ButtonComponentPreview() {
    FoodMarketCloneTheme {
        CustomButton(
            text = "Lanjut",
            onClick = {}
        )
    }
}