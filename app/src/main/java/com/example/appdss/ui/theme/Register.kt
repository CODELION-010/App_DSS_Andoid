package com.example.appdss

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.example.appdss.ui.theme.AppDssTheme



class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDssTheme {
                AppRegister()
            }
        }
    }
}

@Composable
fun AppRegister() {
    val context = LocalContext.current
    // Configuración de la pantalla de bienvenida con los botones
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = (Color.Blue))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(
            text = "Registro de Usuario",
            fontSize = 34.sp,
            modifier = Modifier.padding(bottom = 0.dp),
            color = Color.White
        )
        Text(
            text = "Daily Square System",
            fontSize = 34.sp,
            modifier = Modifier.padding(bottom = 5.dp),
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.logo_app),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)

        )

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = {
                Text(text = "Nombre de Usuario",
                    color = Color.White
                )
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = {
                Text(text = "Correo Electonico",
                    color = Color.White
                )
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = {
                Text(text = "Constraseña",
                    color = Color.White
                )
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            visualTransformation = PasswordVisualTransformation(),

            )

        OutlinedTextField(
            value = "",
            onValueChange ={},
            label = {
                Text(text = "Número de Celular",
                    color = Color.White
                )
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        // Botón para registrarse
        Button(
            onClick = { val intent = Intent(
                context,
                LoginActivity::class.java
            )
                context.startActivity(intent)},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Registrar",
                fontSize = 28.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun AppRegisterPreview() {
    AppDssTheme {
        AppRegister()
    }
}


