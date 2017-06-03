package functions

/**
 * Created by divya on 03/06/17.
 */


fun sum(x: Int, y: Int, z: Int): Int
{
    return x+y+z
}

//function with default z value
fun sumDefault(x: Int, y: Int, z: Int = 0): Int
{
    return x+y+z
}

fun printDetail(name: String, email: String, phone: String)
{
    println("name: $name - email: $email - phone: $phone")
}

fun printDefaultDetail(name: String, email: String = "", phone: String)
{
    println("name: $name - email: $email - phone: $phone")
}

fun printDefaultExchange(name: String, email: String = "", phone: String = "")
{
    println("name: $name - email: $email - phone: $phone")
}

fun main(args: Array<String>) {

    val sumValue = sum(1,2,3)
    println(sumValue) //6

    val sumDefaultValue = sumDefault(1,2)
    println(sumDefaultValue) //3

    printDetail("Divya", "divya@gmail.com" , "12345") //name: Divya - email: divya@gmail.com - phone: 12345

    printDefaultDetail("Divya", phone = "12345") //name: Divya - email:  - phone: 12345

    printDefaultExchange("Divya", phone = "12345" , email = "divya@gmail.com") //name: Divya - email: divya@gmail.com - phone: 12345

}