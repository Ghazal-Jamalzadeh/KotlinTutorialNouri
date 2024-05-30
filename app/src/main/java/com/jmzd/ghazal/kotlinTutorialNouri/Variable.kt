package com.jmzd.ghazal.kotlinTutorialNouri
/*
* داده هایی که داخل یک ظرفی قرار میگیرند
* var vs val :
* val -> ظرفی که توش آب میریزم و دو لیتر آب هم هست. نه میتونم محتواشو عوض کنم نه حجمشو
* معادل فاینال هست توی جاوا
* var -> تغییر میکنه
*
* */
fun main() {

   var age : Int = 25
   age = 35

    var age2 = 25

    //var f : Float = 19.5 // Error
    /*
    * توی اعداد اعشاری اگه اف نذاریم دابل در نظر میگیره
    * */
    var f : Float = 19.5f

    var d : Double = 19.5

    var sh : Short = 5

    var b : Boolean = false

    var ch : Char = 'a'
//    var ch2 : Char = 'ab' // Error
//    var ch : Char = "a" //Error

    var s : String = "ab"

    val name = "Ghazal"
    //name = "Pari" //Error
}