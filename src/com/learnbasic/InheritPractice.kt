package com.learnbasic
//parent class
open class Animal{

    fun eat(){
        println("He can eat")
    }
    fun run(){
        println("He can run")
    }

    fun sleep()
    {
        println("He can sleep")
    }
}
//Child class
class Dog:Animal(){
    fun walk(){
        println("He can walk")
    }
}

fun main(){
val obj= Dog()

    obj.walk()
    obj.run()
    obj.eat()
    obj.sleep()
}