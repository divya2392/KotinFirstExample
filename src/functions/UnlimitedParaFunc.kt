package functions

/**
 * Created by divya on 03/06/17.
 */

fun printStrings(vararg strings: String)
{
    for(stringValue in strings)
    {
        println(stringValue)
    }
}

fun printStringsValue(vararg strings: String)
{
    reqallyprintingString(*strings)
}

private fun reqallyprintingString(vararg strings: String){

    for (string in strings) {
        println(string)
    }
}


fun main(args: Array<String>) {

    printStrings("1")
    printStrings("1","2")
    printStrings("1","2","3")

    printStringsValue("9")
    printStringsValue("9","8")
    printStringsValue("9","8","7")

}