// Luis Alejandro Hernandez Marquez (241424)
// Programacion de plataformas moviles sec 30
// Juan carlos Durini
package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme  {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Portada()
                }
            }
        }
    }
}
@Preview
@Composable
fun Portada() {
    // BOX principal con borde verde
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .border(width = 4.dp, color = Color(0xFF006400), shape = RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.Center
    ) {
        // Imagen de fondo (marca de agua)
        Image(
            painter = painterResource(id = R.drawable.logo_uvg),
            contentDescription = "Logo UVG",
            modifier = Modifier
                .fillMaxSize()
                .padding(60.dp),
            contentScale = ContentScale.Fit,
            alpha = 0.08f
        )

        // Columna con todo el contenido
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Nombre universidad
            Text(
                text = "Universidad del Valle\n de Guatemala",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            // Nombre del curso
            Text(
                text = "Programación de plataformas móviles, Sección 30",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )

            // Integrantes
            Column(horizontalAlignment = Alignment.Start) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()

                ){
                    Text(text = "INTEGRANTES", fontWeight = FontWeight.Bold)
                    Text(text = "Luis Hernandez")
                }
                Column (
                    horizontalAlignment = AbsoluteAlignment.Right,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Row { Text(" Sebastian Lemus") }
                    Row { Text(" Arodi Chavez") }

                }

            }
            Spacer(modifier = Modifier.height(12.dp))

            // Catedrático
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "CATEDRÁTICO", fontWeight = FontWeight.Bold)
                Text(text = "Juan Carlos Durini")
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Espacio para alumno y carnet
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Luis Alejandro Hernandez Marquez")
                Text(text = "241424")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPortada() {
    Lab4Theme{
        Portada()
    }
}