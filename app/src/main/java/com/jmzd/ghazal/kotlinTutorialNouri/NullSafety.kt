package com.jmzd.ghazal.kotlinTutorialNouri

fun main() {

    //var a : String = null // Error

    val name : String?
    name = null
    //name = "" // Error

    var family : String? = null
    println(family) // null
    //println(family!!.length) //Error
    println("length is ${family?.length}") // length is null
    println(family?.length  ?: 0 ) // 0
    println(name?: "Elvis Condition") //Elvis Condition

    if(family == null){
        println("family is null...") // print
    }else {
        println("not null...")
    }

    /*
    * scope function
    * لت نال رو بررسی میکنه ولی فقط if هست و else ی در کار نیست
    * */
    family?.let {
        println("Hello $it")
    }

    val userName : String? = "ghazal"
        userName?.let {
        println("Hello $it") // Hello ghazal
    }




}