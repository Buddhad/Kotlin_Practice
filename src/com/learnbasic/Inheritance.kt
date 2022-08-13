package com.learnbasic

open class Persons{
    var money=500000

    //by default all function are final if we want to override that we have to use the open syntax
    open fun display(){
        println("He has $money.")
    }

}

class Son(private val name:String):Persons(){

    fun displaySon(){
        println("My name is $name and I have $money money")
    }

    override fun display(){
        println("This is child override")
    }

}

fun main(){

    val obj=Son("Aditya")
    obj.displaySon()

    obj.money=60000000
    obj.displaySon()
    obj.display()

}