package aej.android.enthusiast.foodmarketclone.ui.component

import aej.android.enthusiast.foodmarketclone.R
import aej.android.enthusiast.foodmarketclone.theme.FoodMarketCloneTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopRegisterBar(
    modifier: Modifier = Modifier,
    title: String,
        subtitle: String? = null,
    showNavigateBack: Boolean = false,
    onNavigateBack: () -> Unit = {},
) {
    Column {
        Row(
            modifier = modifier
                .background(colorResource(id = R.color.white)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (showNavigateBack) {
                IconButton(
                    onClick = {
                        onNavigateBack()
                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_left),
                        contentDescription = "Localized description"
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.padding(vertical = 16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.black)
                )
                subtitle?.let {
                    Text(
                        text = subtitle,
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.gray),
                    )
                }
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun DefaultPreview() {
    FoodMarketCloneTheme {
        TopRegisterBar(
            title = "Title",
            showNavigateBack = true
        )
    }
}