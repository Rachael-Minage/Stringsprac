fun main(){  verify()
    names()
    var wholeSentence = sentence("RACHAEL",56)
    println(wholeSentence)
    length()

}



fun names(){
    var a = "Akirachix"
    var b = (a[0].toString()+ a[2] + a[3])
    println(b)
}
fun sentence(x: String, y: Int): String{
    var z = "Hi, my name is $x and I am $y years old"
    return z

}
fun length(){
    var c = "A stich in time saves nine"
    println("This string has ${c.length} characters")

}
fun verify(){
    var  noun = "Ray"
    if ("Ray" in noun)
    {
        println("That's me")
    }
        else {
            println("I don't know")
        }
    }
