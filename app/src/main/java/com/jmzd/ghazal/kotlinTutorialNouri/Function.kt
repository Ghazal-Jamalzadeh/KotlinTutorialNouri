package com.jmzd.ghazal.kotlinTutorialNouri

fun main(){
    printSumNumbers(1 , 3 ) // 4
    printSumNumbers(4 , 6) // 10

}

fun printSumNumbers(number1 : Int, number2 : Int ){
    val sum = number1 + number2
    println(sum)
}

/*
* اگر ریترن تایپ رو مشخص نکنیم به صورت پیش فرض Unit خواهد بود
* معادل همون void در جاوا هست
* یعنی هیچی
* */
fun sumNumbers(number1 : Int, number2 : Int ) : Int{
    val sum = number1 + number2
    return sum
}

