package com.jmzd.ghazal.kotlinTutorialNouri

fun main() {

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }

    // 1 - 2 - 4 - 5

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    // 1 - 2

    /*
* توی مثال پایین و حلقه های تو در تو اگه بگیم برکش کن نمیدونیم دقیقا کدوم حلقه برک میشه
* این مهمه که دستورات ما قابل تفکیک باشن از هم
*
* */

    for (i in 1..4) {
        for (j in 1..3) {
            if (j == 2) {
                break
            }
            println("$i --- $j")
        }
    }
    //    1 --- 1
    //    2 --- 1
    //    3 --- 1
    //    4 --- 1

    iLoop@ for (i in 1..4) {
        jLoop@ for (j in 1..3) {
            if (j == 2) {
                break@jLoop
            }
            println("$i --- $j")
        }
    }

    //    1 --- 1
    //    2 --- 1
    //    3 --- 1
    //    4 --- 1

    iLoop@ for (i in 1..4) {
        jLoop@ for (j in 1..3) {
            if (j == 2) {
                break@iLoop
            }
            println("$i --- $j")
        }
    }

    //    1 --- 1

    println("----------------")

    iLoop@ for (i in 1..4) {
        jLoop@ for (j in 1..3) {
            if (j == 2) {
                continue@jLoop
            }
            println("$i --- $j")
        }
    }

    //    1 --- 1
    //    1 --- 3
    //    2 --- 1
    //    2 --- 3
    //    3 --- 1
    //    3 --- 3
    //    4 --- 1
    //    4 --- 3
}