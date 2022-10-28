package com.example.shirucafeclone

sealed class NavigationDrinks( val route : String){
    object Animated : NavigationDrinks("anime")
    object Home: NavigationDrinks("home")
    object GetDrink : NavigationDrinks("getdrinks")
    object SelectDrinkCold:NavigationDrinks("selectdrinkcold")
    object SelectDrinkHot:NavigationDrinks("selectdrinkhot")
    object Info:NavigationDrinks("info")
    object AboutUs:NavigationDrinks("aboutus")
    object Lemon:NavigationDrinks("lemon")
    object Image:NavigationDrinks("image")
}
