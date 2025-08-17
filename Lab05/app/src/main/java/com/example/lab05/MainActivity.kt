// Luis Alejandro Hernandez Marquez (241424)
// Programacion de plataformas moviles sec 30
// Juan carlos Durini
package com.example.lab05

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab05.ui.theme.Lab05Theme
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab05Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    pantallaPrincipal()
                }
            }
        }
    }
}

// pantalla principal
@Composable
fun pantallaPrincipal() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)


    ) {

        Spacer(modifier = Modifier.height(15.dp))

        // boton de actualizar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal =8.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AtributoActualizar(
                icon = Icons.Default.Refresh,
                funcion = "Actualización disponible",
                modifier = Modifier
            )
        }
        Spacer(modifier = Modifier.height(14.dp))

        // jornada
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            // columan para dia y fecha
            Column{
                Text(
                    text = "Jueves",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold

                )
                // row para la fecha y la programacion del toast en boton terminar jornada
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Text (
                        text = "15 de mayo",
                        style = MaterialTheme.typography.titleLarge

                    )
                    Button(onClick = {

                        Toast.makeText(
                            context,
                            "Jornada terminada por Luis Alejandro Hernández Márquez",
                            Toast.LENGTH_LONG
                        ).show()
                    }){
                        Text("Terminar Jornada")
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        // informacion de restaurante en una nueva columan
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEFEFEF), RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ){
                Text(
                    text = "Donde Joselito",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                val context = LocalContext.current
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Abrir en Maps",
                    modifier = Modifier
                        .size(34.dp)
                        .padding(4.dp)
                        .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(50))
                        .padding(4.dp)
                        .clickable {
                            val intent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://maps.app.goo.gl/ka1nvaLLEEfF3B3L8")
                            )
                            context.startActivity(intent)
                        },
                    tint = Color.White
                )



            }
            // row para la direccion
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ){
                Text(
                    text = "4ta Avenida 10-06 - Zona 9 - Guatemala",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.W400

                )
            }

            Spacer(modifier = Modifier.height(4.dp))
            // row para el horario
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ){
                Text(
                    text = "11:30 AM - 10:00 PM",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.W300
                )
            }


            Spacer(modifier = Modifier.height(10.dp))

            // Botones iniciar y detalles
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = {
                    Toast.makeText(
                        context,
                        "Iniciado por Luis Alejandro Hernández Márquez",
                        Toast.LENGTH_LONG
                    ).show()
                },
                    modifier = Modifier.weight(1f)
                    ) {
                    Text("Iniciar")
                }


                Button(onClick = {
                    val intent = Intent(context, DetallesActivity::class.java)
                    context.startActivity(intent)
                },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Detalles")
                }
            }
        }
    }
}


//funcion para crear la primera fila donde hay icono, texto y redirige a play stor
@Composable
fun AtributoActualizar(
    icon: ImageVector,
    funcion: String,
    modifier: Modifier = Modifier

){
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ){
        Icon(
            imageVector = icon,
            contentDescription = "Abrir WhatsApp",
            modifier = Modifier
                .size(45.dp)
                .padding(4.dp)
                .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(50))
                .padding(4.dp)
        )
        Text(text = funcion, color = MaterialTheme.colorScheme.onPrimary,)
        TextButton(onClick = {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")
            )
            // context.startActivity(intent)
            context.startActivity(intent)
            })
        {
            Text(
                "Descargar",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewResolucionImagenPlatz() {
    Lab05Theme {
        pantallaPrincipal()
    }
}


