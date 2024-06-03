package com.jmzd.ghazal.kotlinTutorialNouri

fun main(){
    val a = arrayOf(1 , false , "Hi")
    println(a[0]) // 1

    for(item in a ){
        println(item)
    }

    val b = arrayListOf(1 , false , "hi")
    for(item in b ){
        println(item)
    }

    val c = arrayOf<Int>(1 , 3, 5)

    /*آرایه در آرایه -> آرایه چند بعدی */
    val d = arrayOf(
        arrayOf(1 , 2, 3) ,
        arrayOf(4 , 5, 6) ,
        arrayOf(7 , 8, 9) ,
    )

    for (arrayChild in d){
        for (item in arrayChild ){
            println(item)
        }
    }

    // 1- 2 - 3 - 4 - 5- -6 -7 -8 - 9


}