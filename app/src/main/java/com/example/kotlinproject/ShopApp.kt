package com.example.kotlinproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun MainView() {

    val navController = rememberNavController()
    val scState = rememberScaffoldState()

Scaffold (
    scaffoldState = scState,
    topBar = {TopBar()},
    bottomBar = { NavBar(navController) },
        ) {
            NavHost(navController = navController, startDestination = "Login") {
             composable(route="Login") {
             Column( modifier = Modifier
                 .fillMaxSize()
                 .background(color = Color.LightGray)
                 , verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
             ) {
                 Text(text = "Log in", fontSize = 35.sp, fontFamily = FontFamily.Cursive)
                 OutlinedTextField(value = "Username", onValueChange = {}, label = { Text(text = "Username")})
                 Spacer(modifier = Modifier.height(20.dp))
                 OutlinedTextField(value = "Password", onValueChange = {}, label = { Text(text = "Password")})
                 OutlinedButton(onClick = {}) {
                     Text(text = "Login")
                 }
                 OutlinedButton(onClick = {}) {
                     Text(text = "Not registered? Click here")
                 }
             }
             }
                
                composable(route="Bikes") {
                    Column (modifier = Modifier
                        .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(painter = painterResource(R.drawable.gx2), contentDescription ="", modifier = Modifier.size(200.dp) )
                        Text(text = "Gravel Lite, 799$")
                        Image(painter = painterResource(R.drawable.gx1), contentDescription ="", modifier = Modifier.size(200.dp) )
                        Text(text = "Gravel GRX, 1199$")
                        Image(painter = painterResource(R.drawable.topstone2), contentDescription ="", modifier = Modifier.size(200.dp) )
                        Text(text = "Cannondale GX, 1499$")
                        Image(painter = painterResource(R.drawable.trekdomane), contentDescription ="", modifier = Modifier.size(200.dp) )
                        Text(text = "Trek Domane, 1299$")
                    }
                }
                
                composable(route="Chatbox") {
                    Column (
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = Color.LightGray),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Top
                            ) {
                        Spacer(modifier = Modifier.height(13.dp))
                            Text(text = "Do you want to ask anything?",fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(13.dp))
                        Text(text = "About our services or products?",fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(13.dp))
                        Text(text = "Do not hesitate to contact us!",fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(13.dp))
                            Text(text = "Phone: +358401289666", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Email: Jussi@GXBROS.se", fontWeight = FontWeight.Bold, fontSize = 20.sp)



                    }
                }
                
                
                
                
                
            }
}
}


@Composable
fun TopBar() {
Row (
    modifier = Modifier
        .fillMaxWidth()
        .height(70.dp)
        .background(Color.Gray),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
        ){
        Text(text = "Gravel Brothers Webshop", fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, fontSize = 30.sp)
}
}


@Composable
fun NavBar(navController: NavHostController) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
            ){
                    Icon(painter = painterResource(R.drawable.ic_baseline_login_24), contentDescription =""
                    , modifier = Modifier.clickable { navController.navigate("Login") })
                    Icon(painter = painterResource(R.drawable.ic_bicycle), contentDescription =""
                        , modifier = Modifier.clickable { navController.navigate("Bikes") })
                    Icon(painter = painterResource(R.drawable.ic_baseline_chat_bubble_24), contentDescription = ""
                        , modifier = Modifier.clickable { navController.navigate("Chatbox") })

    }
}


@Composable
fun MainContent() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Green)) {


    }
}


