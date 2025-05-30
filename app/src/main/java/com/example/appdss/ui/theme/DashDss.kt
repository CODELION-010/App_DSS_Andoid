package com.example.appdss


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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.example.appdss.ui.theme.AppDssTheme



class DasHomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDssTheme {
                DasHome()
            }
        }
    }
}

@Composable
fun DasHome() {

    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Títulos
        Text(
            text = "Sección de Registros",
            fontSize = 34.sp,
            modifier = Modifier.padding(bottom = 5.dp),
            color = Color.Blue
        )
        Text(
            text = "Daily Square System",
            fontSize = 28.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            color = Color.Blue


        )

        // Logo
        Image(
            painter = painterResource(id = R.drawable.logo_app),
            contentDescription = "Logo",
            modifier = Modifier.size(150.dp)
        )

        // Caja para cada input
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White, shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp))
        ) {
            // Input de correo
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Monto Base") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón para correo */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Registrar")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Input de contraseña
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Retiro") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón para contraseña */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Registrar")
            }

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Deposito") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón para contraseña */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Registrar")
            }



        }

        Spacer(modifier = Modifier.height(32.dp))

    }
}


@Preview(showBackground = true)
@Composable
fun DasHomePreview() {
    AppDssTheme {
        DasHome()
    }
}

