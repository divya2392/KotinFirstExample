package basics

/**
 * Created by divya on 01/06/17.
 */

fun main(args: Array<String>) {

    var myNameString1 = "Divya"

    if (myNameString1 != "")
    {
        println("myNameString1 is Not Empty")
        //myNameString1 is Not Empty
    }else
    {
        println("myNameString1 Is Empty")
    }

    //====================================

    var myNameString2 = "Divya"

    val result = if (myNameString2 != "")
    {
        println("myNameString2 is Not Empty")
        //myNameString2 is Not Empty
        //kotlin.Unit covalent of void returns last line of expression!
    }else
    {
        println("myNameString2 Is Empty")
    }
    println(result)

    //====================================

    var myNameString3 = "Divya"

    val result3 = if (myNameString3 != "")
    {
        println("myNameString3 is Not Empty")
        "Not Empty"
        // myNameString3 is Not Empty
        // Not Empty
    }else
    {
        println("myNameString2 Is Empty")
    }
    println(result3)

    //====================================

    val result4 = "value"
    when (result4)
    {
        "value" ->
        {
            println("Value")
            println("Second Value")
            // Found its condition it print String - Value
            // Second Value
        }
        is String -> println("Excellent")
    }


    //====================================

    val result5 = "value"
    when (result5)
    {
        is String -> println("Excellent")  // Found its condition it print String - Excellent
        "value" ->
        {
            println("Value")
            println("Second Value")
        }
    }

    // Don't neet breaks like other conditional

    //====================================
    // If you use as an expression use else!

    val result6 = "value"
    var whenValue = when (result6)
    {
        "value" ->
        {
            println("whenValue Value")
            println("whenValue Second Value")
            // Found its condition it print String - Value
            // Second Value
            // Kotlin.Unit
        }
        is String -> println("whenValue Excellent")
        else -> println("whenValue it come here")
    }
    println(whenValue)

    //====================================

    val result7 = "value"
    var whenValue1 = when (result7)
    {
        "value" ->
        {
            println("whenValue Value")
            println("whenValue Second Value")
            "Returning from first statement"
            // Found its condition it print String - Value
            // Second Value
            // Returning from first statement
        }
        is String -> println("whenValue Excellent")
        else -> println("whenValue it come here")
    }
    println(whenValue1)

    //====================================

    val result8 = ""
    var whenValue2 = when (result8)
    {
        "value" ->
        {
            println("whenValue Value")
            println("whenValue Second Value")
            "Returning from first statement"
        }
        is String -> {
            println("whenValue Excellent")
            "Remove That"
            // whenValue Excellent
            // Remove That
        }
        else -> {
            println("whenValue it come here")
            "This Warning is now gone"
        }
    }
    println(whenValue2)
}
