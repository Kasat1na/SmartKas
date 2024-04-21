package com.example.myapplication.navigation

sealed class Screens (val route:String) {

    object Board1 : Screens("Board1")
    object Board2 : Screens("Board2")
    object Board3 :Screens("Board3")
    object Board4:Screens("Board4")
    object Board5:Screens("Board5")
    object Board6:Screens("Board6")

    fun withArg(vararg args:String):String
    {
        return buildString {
            append(route)
            args.forEach {arg ->
                append("/$arg")
            }
        }
    }

}