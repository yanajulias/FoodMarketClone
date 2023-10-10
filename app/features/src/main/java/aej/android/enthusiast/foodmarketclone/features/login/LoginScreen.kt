package aej.android.enthusiast.foodmarketclone.features.login

import aej.android.enthusiast.foodmarketclone.features.R
import aej.android.enthusiast.foodmarketclone.features.ui.components.CustomButton
import aej.android.enthusiast.foodmarketclone.features.ui.components.InputTextField
import aej.android.enthusiast.foodmarketclone.features.ui.components.TopLoginBar
import aej.android.enthusiast.foodmarketclone.features.ui.theme.FoodMarketCloneTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        containerColor = colorResource(id = R.color.light_gray),
        topBar = {
           TopLoginBar(
                title = stringResource(id = R.string.string_title_login),
                subtitle = stringResource(id = R.string.string_subtitle_login),
            )
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(top = innerPadding.calculateTopPadding() + 24.dp)
                    .fillMaxSize(),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.white))
                        .verticalScroll(rememberScrollState())
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(colorResource(id = R.color.white))
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                            InputTextField(
                                label = stringResource(id = R.string.string_email_label),
                                placeholder = stringResource(id = R.string.string_email_placeholder),
                                keyboardOptions = KeyboardOptions.Default.copy(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Next
                                ),
                                onValueChange = {},
                                value = ""

                            )
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                           InputTextField(
                                label = stringResource(id = R.string.string_password_label),
                                placeholder = stringResource(id = R.string.string_password_placeholder),
                                keyboardOptions = KeyboardOptions.Default.copy(
                                    keyboardType = KeyboardType.Password,
                                    imeAction = ImeAction.Done
                                ),
                                onValueChange = {},
                                value = ""

                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        CustomButton(
                            modifier = Modifier.padding(16.dp),
                            text = stringResource(id = R.string.string_register_now),
                            onClick = {}
                        )
                    }
                }
            }
        }
    )
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun LoginPreview() {
    FoodMarketCloneTheme {
        LoginScreen()
    }
}