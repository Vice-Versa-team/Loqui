package team.viceversa.loqui.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import team.viceversa.loqui.ui.theme.LoquiTheme

@Composable
fun LoginScreen() {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .align(Alignment.Center)
        ) {

            AuthTextField(
                label = "Логин",
                onValueChanged = { login = it }
            )

            AuthTextField(
                label = "Пароль",
                visualTransformation = PasswordVisualTransformation(),
                onValueChanged = { password = it }
            )

            AuthScreenButton(
                label = "Войти",
                onClicked = {}
            )
        }


        AuthScreenButton(
            label = "Зарегистрироваться", onClicked = {}, modifier = Modifier.align(
                Alignment.BottomCenter
            )
        )
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoquiTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen()
        }
    }
}