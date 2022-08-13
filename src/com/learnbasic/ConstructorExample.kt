package com.learnbasic


//Primary Constructor
class Person(private val name:String, private val age:Int){

    fun display(){
        println("He is $name and his age is $age.")
    }

}


class  Pen {

    var color:String
    var price:Int

    constructor(color: String, price: Int) {
        this.color=color
        this.price=price

    }

    fun Display(){
        println("The pen color is $color and pen price is $price")
    }
}
fun main(){
 var fpen=Pen("Red",5)
    fpen.Display()
 var spen=Pen("Blue",10)
    spen.Display()
 var tpen=Pen("Black",25)
    tpen.Display()


}