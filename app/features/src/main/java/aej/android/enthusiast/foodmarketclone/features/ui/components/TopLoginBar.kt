package aej.android.enthusiast.foodmarketclone.features.ui.components

import aej.android.enthusiast.foodmarketclone.features.R
import aej.android.enthusiast.foodmarketclone.features.ui.theme.FoodMarketCloneTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopLoginBar(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String
) {
    Column {
        Row(
            modifier = modifier
                .background(colorResource(id = R.color.white)),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.padding(vertical = 16.dp)
                    .padding(start = 6.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.black)
                )
                Text(
                    text = subtitle,
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.titleSmall,
                    color = colorResource(id = R.color.gray),
                )
            }
        }

    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun DefaultPreview() {
   FoodMarketCloneTheme {
        TopLoginBar(
            title = "Login",
            subtitle = "Kalo udah punya akun langsung masuk aja gan."
        )
    }
}