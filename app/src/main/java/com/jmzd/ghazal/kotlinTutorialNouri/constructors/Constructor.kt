package com.jmzd.ghazal.kotlinTutorialNouri.constructors
/*
* constructor types in Kotlin :
* 1- Primary constructor
* 2- Secondary constructor
* هر کلاسی میتونه قثط یک سازنده پرایمری داشته باشه
* ولی میتونه چندین سازنده سکندری داشته باشه
* پرایمری باید توی هدر کلاس باشه
* الزامی وجود ندارد که برای داشتن سازنده سکندری حتما پرایمری داشته باشیم یا برعکس
* پرایمری کانستراکتور خودش به تنهایی توی کاتلین قابلیت استفاده شدن رو نداره
* برای استفاده ازش باید از بلاک init استفاده کنیم
* به محض تعریف کلاس این بلاک کد اجرا میشه
*
* ولی نکته ای که هست اینه که سکندری کانستراکتور باید حتما از پرایمری ارث بری کنه
* و موارد اون رو پوشش بده
* و تحت هر شرایطی اول بلاک init اجرا میشه بعد سازنده سکندری
*
* اگر برای پارامتر ورودی مقدار اولیه ست کنیم نیازی نیس حتتما مقداری بهش پاس بدیم
* آپشنال میشه
*
* */
fun main(){

    val parimaryUser = User(id = 10)
    // New user is created with id : 10
    // id => 10

    val secondaryUser = User (name = "Ghazal" , age = 29 , userId = 1000)
    //New user is created with id : 1000
    //id => 1000
    //User 1000 is Ghazal with age 29

}