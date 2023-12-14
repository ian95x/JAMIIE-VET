package com.example.jamiie_vet.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jamiie_vet.ui.theme.screens.education.EducationScreen
import com.example.jamiie_vet.ui.theme.screens.home.HomeScreen
import com.example.jamiie_vet.ui.theme.screens.login.LoginScreen
import com.example.jamiie_vet.ui.theme.screens.products.AddProductScreen
import com.example.jamiie_vet.ui.theme.screens.products.ViewProductScreen
import com.example.jamiie_vet.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier=Modifier,
    startDestination: String = LOGIN_URL)
{
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination)
    {

        composable(LOGIN_URL){
            LoginScreen(navController=navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController=navController)
        }
        composable(HOME_URL){
            HomeScreen(navController=navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductScreen(navController=navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductScreen(navController=navController)
        }
        composable(EDUCATION_URL){
            EducationScreen(navController=navController)
        }



    }
}


