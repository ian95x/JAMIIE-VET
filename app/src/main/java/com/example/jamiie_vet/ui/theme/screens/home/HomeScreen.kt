package com.example.jamiie_vet.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jamiie_vet.navigation.ADD_PRODUCTS_URL
import com.example.jamiie_vet.navigation.EDUCATION_URL
import com.example.jamiie_vet.navigation.VIEW_PRODUCTS_URL
import com.example.jamiie_vet.ui.theme.JamiiEvetTheme


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jamii E-VET",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ADD_PRODUCTS_URL)
        }) {
            Text(text = "Add Products")
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(VIEW_PRODUCTS_URL)
        }) {
            Text(text = "View Products")
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(EDUCATION_URL)
        }) {
            Text(text = "Learn more")
        }
    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    JamiiEvetTheme {
        HomeScreen(navController = rememberNavController())
    }
}