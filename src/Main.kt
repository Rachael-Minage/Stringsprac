fun main(){
    names()
    sentence()
    length()
    verify()
}
fun names(){
    var a = "Akirachix"
    var b = (a[0].toString() + a[2] + a[3])
    println(b)
}
fun sentence(){
    var name = "Rachael Minage"
    var age = 40
    println("Hi,my name is $name and I am $age years old")
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
