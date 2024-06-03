package com.jmzd.ghazal.kotlinTutorialNouri.constructors

class User(id : Int , grade : Int  = 0) {

    val name = "id => $id"

    init {
        println("New user is created with id : $id")
        println(name)
    }

    constructor(name : String , age : Int  , userId : Int  ) : this(id = userId ) {
        println("User $userId is $name with age $age " )
    }
}