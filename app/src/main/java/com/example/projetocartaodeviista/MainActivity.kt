package com.example.projetocartaodeviista

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetocartaodeviista.ui.theme.ProjetocartaodeviistaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaProjetocartaodeviista()
                // A surface container using the 'background' color from the theme

            }
        }
    }

@Preview(showSystemUi = true)
@Composable
fun TelaProjetocartaodeviista(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
      Image(
          painter = painterResource(id = R.drawable.amongusss),
          contentDescription=null,
          modifier = Modifier.size(250.dp)

      )
        Text(
            text = "Maycol Daynor",
            fontSize = 30.sp,
            modifier = Modifier.padding(30.dp)
        )
        Text(
            text ="Cartão de visita",
            fontSize = 20.sp,



        )

    }


}

