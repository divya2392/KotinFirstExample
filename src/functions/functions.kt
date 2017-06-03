package functions

/**
 * Created by divya on 03/06/17.
 */

//function with no parameter
fun hello()
{
    println("hello")
}

//return void, In kotlin unit is void
fun voidHello(): Unit
{
    println("voidHello")
}

//value which is not exist
fun throwing(): Nothing
{
    throw Exception("This function throw exception!!")
    //java.lang.Exception: This function throw exception!!
    //at functions.FunctionsKt.throwing(functions.kt:21)
    //at functions.FunctionsKt.main(functions.kt:29)
}

//return an int value
fun returnAnInteger(): Int
{
    return 5
}

//return a string
fun returnString(name: String)
{
    println(name)
}

//return an integer value using more than one parameter
fun moreThanOneParameter(x: Int, y: Int): Int
{
    return x + y
}

fun main(args: Array<String>) {

    hello() //hello

    voidHello() //voidHello

    val returnAnIntegerValue = returnAnInteger()
    println(returnAnIntegerValue) //5

    returnString("Divya") //Divya

    val moreThanOneParameterValue = moreThanOneParameter(4,5)
    println(moreThanOneParameterValue) //9

}

