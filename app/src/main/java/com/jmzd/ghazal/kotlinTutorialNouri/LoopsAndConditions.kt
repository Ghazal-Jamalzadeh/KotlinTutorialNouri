package com.jmzd.ghazal.kotlinTutorialNouri

fun main(){
    val name1 = "Ghazal"
    val name2 = "Ghazal"

    if(name1.equals(name2)){
        println(true) // print
    }

    val a = 5
    val b = 8
    val max = if(a > b) {a} else {b}
    println(max) // 8

    val x = 10

    when(x){
        1 -> println("Number is 1")
        2 -> println("Number is 2")
        3 -> println("Number is 3")
        4 -> println("Number is 4")
        5 -> println("Number is 5")
        6 ->{
            println("multiline operation")
        }
        7,8 -> println("number is 7 or 8")
        in 10..20 -> println("10 <= x <= 20")
        else -> println("Number is invalid")
    }

    for (i in 0..10){ // 0 <= i <= 10
        println(i) // 0 ... 10
    }

    for (i in 0 until 10){ // 0 <= i < 10
        println(i) // 0 ... 9
    }

    for (i in 0 until 10 step 2 ){ // 0 <= i < 10
        println(i) // 0 - 2 - 4 - 6 - 8
    }

    for (i in 10 downTo 0) { // 10 >= i >= 0
        println(i) // 10 ... 0
    }

    val names = listOf("Ghazal" , "Parisa" , "Parsa" )
    for(name in names){ //foreach
        println(name)
    }

    var number = 10
    while(number < 15){
        println(number) // 10 ... 14
        number++
    }

    var number2 = 10
    while(number2 < 15){
        println(number2) // 10
        number2+= 5
    }

    var number3 = 15
    do{
        println("show") //show
        number3--

    }while(number3 <= 5)



}