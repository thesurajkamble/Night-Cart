package com.example.night_cart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.night_cart.data.CartData
import com.example.night_cart.data.CartData.cartList
import com.example.night_cart.ui.theme.Night_CartTheme
import com.example.night_cart.data.CartData.cartList;
import com.example.night_cart.data.CartModel
import com.example.night_cart.ui.Card.CartCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Night_CartTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun DetailsContent() {

    val cart = remember { CartData.cartList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            cart
        ) {
            CartCard(cartModel = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Night_CartTheme {
        DetailsContent()
    }
}