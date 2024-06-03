package com.jmzd.ghazal.kotlinTutorialNouri

import java.util.TreeMap

/*
* Kotlin collections :
* توی لیست دسترسی به آیتم ها فقط از طریق ایندکس هست
* ولی مپ ها کی ولیو هستن
*
* */
fun main(){

    val user = TreeMap<String , String>()
    user["name"] = "Ghazal"
    user["city"] = "Isfahan"
    println(user["name"]) // Ghazal

    for(item in user){
        println(item)
    }
//    city=Isfahan
//    name=Ghazal

    for ((key , value) in user){
        println("$key -> $value")
    }
//    city -> Isfahan
//    name -> Ghazal

}