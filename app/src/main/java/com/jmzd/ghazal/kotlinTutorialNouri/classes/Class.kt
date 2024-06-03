package com.jmzd.ghazal.kotlinTutorialNouri.classes

fun main(){
    val utility = Utility()
    utility.name = "Pari"
    println(utility.name) // Pari
    println(utility.sumNumbers(4, 4)) // 8
    println(utility.sumNumbers(number2 = 10 , number1 = 5)) // 15
}