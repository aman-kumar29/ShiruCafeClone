package com.example.shirucafeclone


import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shirucafeclone.ui.theme.Green100
import com.example.shirucafeclone.ui.theme.Green50

@Composable
fun DrinkNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationDrinks.Animated.route) {
        composable(NavigationDrinks.Animated.route) {
            SplashScreenPage(navController)
        }
        composable(NavigationDrinks.HotDrinksPage.route) {
            HotPage(navController)
        }
        composable(NavigationDrinks.Image.route) {
            Image()
        }
        composable(NavigationDrinks.Home.route) {
            HomeScreen(navController)
        }
        composable(NavigationDrinks.GetDrink.route) {
            GetDrinkPage(navController)
        }
        composable(NavigationDrinks.SelectDrinkCold.route) {
            SelectDrinkColdPage(navController)
        }
        composable(NavigationDrinks.SelectDrinkHot.route) {
            SelectDrinkHotPage(navController)
        }
        composable(NavigationDrinks.Info.route) {
            InfoPage(navController)
        }
        composable(NavigationDrinks.AboutUs.route) {
            AboutUsPage(navController)
        }
        composable(NavigationDrinks.Lemon.route) {
            LemonPage(navController)
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(elevation = 5.dp, modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.home), contentDescription = "home",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(25.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "S H I R U  C A F E",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    modifier = Modifier.padding(16.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace
                )
                Row(
                    Modifier
                        .padding(horizontal = 50.dp)
                ) {

                    Spacer(modifier = Modifier.width(5.dp))
                    Button(
                        onClick = {
                            navController.navigate("getdrinks")
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(150.dp))
                    ) {
                        Icon(Icons.Outlined.Coffee, "menu")
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Get Drink")
                    }
                }

            }
        }
        Card(modifier = Modifier.padding(20.dp)) {
            Column(modifier = Modifier.padding(25.dp)) {
                Text(
                    text = "Information",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace
                )
                Text(text = "ぉオ屋ぉオ屋ぉオ屋ぉぉオ屋ぉオ屋ぉオ", modifier = Modifier.padding(top = 8.dp))
                Text(
                    text = "ぉオ屋ぉオ屋ぉオ屋ぉオ屋ぉオ屋ぉオ屋",
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
                )
                Button(
                    onClick = { navController.navigate("info") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "more")
                }
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.background(Color.White)
            ) {
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.Home, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("home") }
                    )
                }
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.Info, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("info") },
                    )
                }
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.QuestionAnswer, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("aboutus") }
                    )
                }
            }

        }
    }
}

@Composable
fun GetDrinkPage(navController: NavHostController) {
//    Scaffold(content = { Text("") },
//        topBar = {
//            TopAppBar() {
//                Text(text = "Select Drink", fontFamily = FontFamily.Monospace, fontSize = 20.sp, fontWeight = FontWeight.Bold )
//            }
//        }
//    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White)
                    .align(Alignment.CenterVertically),
            ) {
                Text(
                    text = "Select Drink",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.background(
                        Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
        Card(elevation = 5.dp, modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.colddrinks), contentDescription = "home",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(25.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "COLD DRINKS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    modifier = Modifier.padding(16.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace
                )
                Row(
                    Modifier
                        .padding(horizontal = 50.dp)
                ) {

                    Spacer(modifier = Modifier.width(5.dp))
                    Button(onClick = {
                        navController.navigate("selectdrinkcold")
                    }, modifier = Modifier.fillMaxWidth()) {
                        Icon(Icons.Outlined.Coffee, "menu")
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Get For Free")
                    }
                }

            }
        }
        Card(elevation = 5.dp, modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.hotdrinks), contentDescription = "home",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(25.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "HOT DRINKS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    modifier = Modifier.padding(16.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace
                )
                Row(
                    Modifier
                        .padding(horizontal = 50.dp)
                ) {

                    Spacer(modifier = Modifier.width(5.dp))
                    Button(onClick = {
                        navController.navigate("selectdrinkhot")
                    }, modifier = Modifier.fillMaxWidth()) {
                        Icon(Icons.Outlined.Coffee, "menu")
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Get For Free")
                    }
                }

            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SelectDrinkColdPage(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White)
                    .align(Alignment.CenterVertically),
            ) {
                Text(
                    text = "Select Drink",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.background(
                        Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }

        LazyVerticalGrid(
            cells = GridCells.Adaptive(175.dp),
            content = {
                items(7) { i ->
                    Box(
                        modifier = Modifier
//                        .padding(8.dp)
                            .aspectRatio(0.9f)
                            .clip(RoundedCornerShape(15.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        when (i) {
                            0 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.lemon),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Lemon")
                            }
                            1 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.litchi),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Litchi")
                            }
                            2 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.rose),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Rose")
                            }
                            3 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.pineapple),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Pineapple")
                            }
                            4 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.orange),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Orange")
                            }
                            5 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.mango),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Mango")
                            }
                            else -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.strawberry),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("lemon") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Strawberry")
                            }

                        }

                    }

                }
            })
    }


}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SelectDrinkHotPage(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White)
                    .align(Alignment.CenterVertically),
            ) {
                Text(
                    text = "Select Drink",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.background(
                        Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }

        LazyVerticalGrid(
            cells = GridCells.Adaptive(175.dp),
            content = {
                items(6) { i ->
                    Box(
                        modifier = Modifier
//                        .padding(8.dp)
                            .aspectRatio(0.9f)
                            .clip(RoundedCornerShape(15.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        when (i) {
                            0 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.blackcoffee),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp), contentScale = ContentScale.Crop)
                                Text(text = "Black Coffee")
                            }
                            1 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.blacktea),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp), contentScale = ContentScale.Crop)
                                Text(text = "Black Tea")
                            }
                            2 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.greentea),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Green Tea")
                            }
                            3 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.gingertea),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp), contentScale = ContentScale.Crop)
                                Text(text = "Ginger Tea")
                            }
                            4 -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.lemontea),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Lemon Tea")
                            }
                            else -> Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.border(
                                    BorderStroke(1.dp, Green100)
                                )
                            ) {

                                Image(painter = painterResource(id = R.drawable.masalatea),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable { navController.navigate("hot") }
                                        .height(130.dp)
                                        .width(130.dp))
                                Text(text = "Masala Tea")
                            }

                        }

                    }

                }
            })
    }
}


@Composable
fun InfoPage(navController: NavHostController) {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .border(BorderStroke(1.dp, Green100))
            ) {
                Card(
                    elevation = 4.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.White)
                        .align(Alignment.CenterVertically),
                ) {
                    Text(
                        text = "I N F O",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier.background(
                            Color.White
                        ),
                        textAlign = TextAlign.Center
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { true }
            ) {
                Column {
                    Image(
                        modifier =
                        Modifier
                            .size(130.dp)
                            .padding(8.dp),
                        painter = painterResource(R.drawable.orange),
                        contentDescription = null
                    )

                }
                Column {
                    Text(
                        text = "バ飲ヷバ飲ババ飲ヷバ飲ヷ",
                        Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        text = "バ飲ヷバ飲ヷバヷバ飲ヷバ飲"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { true }
            ) {
                Column {
                    Image(
                        modifier =
                        Modifier
                            .size(130.dp)
                            .padding(8.dp),
                        painter = painterResource(R.drawable.orange),
                        contentDescription = null
                    )

                }
                Column {
                    Text(
                        text = "バ飲ヷバ飲ババ飲ヷバ飲ヷ",
                        Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        text = "バ飲ヷバ飲ヷバヷバ飲ヷバ飲"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { true }
            ) {
                Column {
                    Image(
                        modifier =
                        Modifier
                            .size(130.dp)
                            .padding(8.dp),
                        painter = painterResource(R.drawable.orange),
                        contentDescription = null
                    )

                }
                Column {
                    Text(
                        text = "バ飲ヷバ飲ババ飲ヷバ飲ヷ",
                        Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        text = "バ飲ヷバ飲ヷバヷバ飲ヷバ飲"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { true }
            ) {
                Column {
                    Image(
                        modifier =
                        Modifier
                            .size(130.dp)
                            .padding(8.dp),
                        painter = painterResource(R.drawable.orange),
                        contentDescription = null
                    )

                }
                Column {
                    Text(
                        text = "バ飲ヷバ飲ババ飲ヷバ飲ヷ",
                        Modifier.padding(vertical = 10.dp)
                    )
                    Text(
                        text = "バ飲ヷバ飲ヷバヷバ飲ヷバ飲"
                    )
                }
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.background(Color.White)
            ) {
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.Home, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("home") }
                    )
                }
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.Info, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("info") },
                    )
                }
                Box(Modifier.padding(horizontal = 30.dp)) {
                    Icon(
                        Icons.Outlined.QuestionAnswer, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .height(50.dp)
                            .width(50.dp)
                            .clickable { navController.navigate("aboutus") }
                    )
                }
            }

        }
    }


}

@Composable
fun AboutUsPage(navController: NavHostController) {
    Column {
        Card(
            elevation = 5.dp, modifier = Modifier
                .padding(8.dp)
                .background(color = Color.White)
                .height(90.dp)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
            ) {
                Text(
                    text = "A B O U T   U S ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(start = 75.dp, top = 10.dp),

                    )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "What's SHIRU CAFE ?", modifier = Modifier
                        .wrapContentHeight(Alignment.Bottom)
                        .wrapContentWidth(Alignment.Start)
                        .padding(start = 10.dp)
                )
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            Box(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.home), contentDescription = null,
                    contentScale = ContentScale.Crop, modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "WELCOME TO SHIRU CAFE !",
                    modifier = Modifier
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(start = 75.dp)
                )
            }
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .height(200.dp)
                ) {
                    Text(
                        text = "SHIRU CAFE Aim to provide unique experience to students all across the globe.",
                        fontWeight = FontWeight.Bold, modifier = Modifier
                            .padding(horizontal = 50.dp)
                            .padding(vertical = 25.dp)
                    )

                    Text(text = "Asjddfldsvn vf vjd d dfpjod d f dfbdf bdjb dib dbd bdf bdfib djd d jbdjb dfbjb dfjbjb")
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .height(200.dp)
                    .background(color = Color.Gray)
                    .fillMaxWidth()
            ) {
                Text(text = "BOLD")
                Text(text = "Normal")
                Row(Modifier.padding(20.dp)) {
                    Icon(
                        Icons.Outlined.Computer, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(60.dp)
                            .width(60.dp)
//                   , RoundedCornerShape(15.dp)
                    )
                    Text(text = "OR")
                    Icon(
                        Icons.Outlined.OfflinePin, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(60.dp)
                            .width(60.dp)
//                   , RoundedCornerShape(15.dp)
                    )

                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .height(200.dp)
                    .background(color = Color.LightGray)
                    .fillMaxWidth()
            ) {
                Text(text = "BOLD")
                Text(text = "Normal")
                Row(Modifier.padding(20.dp)) {
                    Icon(
                        Icons.Outlined.Coffee, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(60.dp)
                            .width(60.dp)
//                   , RoundedCornerShape(15.dp)
                    )
                    Icon(
                        Icons.Outlined.Wifi, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(60.dp)
                            .width(60.dp)
//                   , RoundedCornerShape(15.dp)
                    )
                    Icon(
                        Icons.Outlined.BatteryChargingFull, contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(60.dp)
                            .width(60.dp)
//                   , RoundedCornerShape(15.dp)
                    )

                }
            }

        }
    }
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.background(Color.White)
        ) {
            Box(Modifier.padding(horizontal = 30.dp)) {
                Icon(
                    Icons.Outlined.Home, contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .clickable { navController.navigate("home") }
                )
            }
            Box(Modifier.padding(horizontal = 30.dp)) {
                Icon(
                    Icons.Outlined.Info, contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .clickable { navController.navigate("info") },
                )
            }
            Box(Modifier.padding(horizontal = 30.dp)) {
                Icon(
                    Icons.Outlined.QuestionAnswer, contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .clickable { navController.navigate("aboutus") }
                )
            }
        }

    }
}

@Composable
fun SplashScreenPage(navController: NavHostController) {
    val scale = remember { Animatable(0f) }
//    val alphaAnim= animateFloatAsState(targetValue = if(startAnimation) 1f else 0f,
//        animationSpec = tween(durationMillis = 1500)
//    )
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.6f,
            animationSpec = tween(durationMillis = 1000, easing = {
                OvershootInterpolator(13f).getInterpolation(it)
            })
        )

//        startAnimation = true
//        delay(
//            timeMillis = 2000
//        )
        navController.navigate("home")
    }

    Splash(scale.value)
}

@Composable
fun Splash(scale: Float) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE6F4EA)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.shirucafelogo),
            contentDescription = null,
            modifier = Modifier
                .scale(scale)
        )
    }
}

@Composable
fun LemonPage(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        val scale = remember { Animatable(0f) }
        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, easing = {
                    OvershootInterpolator(10f).getInterpolation(it)
                })
            )
        }
        Image(
            painter = painterResource(id = R.drawable.colddrinkglass),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .scale(scale.value)
        )
        Button(onClick = { navController.navigate("image") }) {
            Text(text = "Click Here to generate the QR Code")
        }

    }

}

@Composable
fun HotPage(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        val scale = remember { Animatable(0f) }
        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, easing = {
                    OvershootInterpolator(10f).getInterpolation(it)
                })
            )
        }
        Image(
            painter = painterResource(id = R.drawable.hotdrinkspage),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .scale(scale.value)
        )
        Button(onClick = { navController.navigate("image") }) {
            Text(text = "Click Here to generate the QR Code")
        }

    }

}

@Composable
fun Image() {
    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "PLEASE HOLD QR CODE OVER THE READER", fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(text = "FREE", fontSize = 22.sp, color = Color.Red, textAlign = TextAlign.Center)
        Image(
            painter = painterResource(id = R.drawable.qrcode),
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        )

    }
}


