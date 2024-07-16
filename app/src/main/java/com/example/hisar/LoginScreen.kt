package com.example.hisar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hisar.ui.theme.HisarTheme
import com.example.hisar.ui.theme.Pink80

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink80)
    ) {

        Text(
            text = "Hisar",
            fontStyle = FontStyle.Italic,
            fontSize = 50.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
                .clickable {
                    navController.navigate(route = Screen.Home.route)
                }
        )

        TextField(
            value = "E-mail",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .padding(top = 100.dp)
        )

        TextField(
            value = "Şifre",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(6.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier.weight(2f)
            ) {
                Text(text = "Giriş Yap")
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(6.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier.weight(2f)
            ) {
                Text(text = "Kayıt Ol")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HisarTheme {
        LoginScreen(navController = rememberNavController())
    }
}