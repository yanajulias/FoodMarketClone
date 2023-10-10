package aej.android.enthusiast.foodmarketclone.features.register

import aej.android.enthusiast.foodmarketclone.features.R
import aej.android.enthusiast.foodmarketclone.features.ui.components.CustomButton
import aej.android.enthusiast.foodmarketclone.features.ui.components.InputTextField
import aej.android.enthusiast.foodmarketclone.features.ui.components.TopRegisterBar
import aej.android.enthusiast.foodmarketclone.features.ui.theme.FoodMarketCloneTheme
import androidx.compose.foundation.background
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
fun AddressScreen(
    popBackStack: () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        containerColor = colorResource(id = R.color.light_gray),
        topBar = {
            TopRegisterBar(
                title = stringResource(id = R.string.string_title_address),
                subtitle = stringResource(id = R.string.string_subtitle_address),
                showNavigateBack = true,
                onNavigateBack = popBackStack
            )
        },
        content = { innerPadding ->
            Spacer(modifier = Modifier.height(24.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.white))
                    .verticalScroll(rememberScrollState())
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    InputTextField(
                        label = stringResource(id = R.string.string_phone_number_label),
                        placeholder = stringResource(id = R.string.string_phone_number_placeholder),
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
                        label = stringResource(id = R.string.string_address_label),
                        placeholder = stringResource(id = R.string.string_address_placeholder),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Text,
                            imeAction = ImeAction.Next
                        ),
                        onValueChange = {},
                        value = ""

                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    InputTextField(
                        label = stringResource(id = R.string.string_house_number_label),
                        placeholder = stringResource(id = R.string.string_house_number_placeholder),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number,
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
    )
}


@Preview(showBackground = true)
@Composable
private fun AddressPreview() {
    FoodMarketCloneTheme {
        AddressScreen(popBackStack = {})
    }
}