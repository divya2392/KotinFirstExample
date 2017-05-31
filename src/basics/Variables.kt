package basics

/**
 * Created by divya on 31/05/17.
 */

fun main(args: Array<String>) {

    //Mutable
    var streetNumber: Int = 10
    print(streetNumber) //10

    val streetName: String = " Hello kotlin\n"
    print(streetName) //Hello kotlin

    //Imutable
    //Integer
    val numLong = 10L
    val numFloat = 10F
    val numHex = 0x0F
    val numBinary = 0xb01
    val numInt = 100
    val numIntLong: Long = numInt.toLong()

    //String
    val mChar = 'D'
    val mString = "Divya Gupta"

    val escapeCharacter = "A new link\n"
    print(escapeCharacter) //A new link

    val rawString = "Hello, " +
            "I am Divya Gupta." +
            "Working as An Android Developer.\n"
    print(rawString) //Hello, I am Divya Gupta.Working as An Android Developer.

    val multiLines = """Hello,I am Divya Gupta.Working as an Android Developer."""
    print(multiLines) //Hello,I am Divya Gupta.Working as an Android Developer.

    val mYear = 10
    val mMessage = "A decade is $mYear year.\n"
    print(mMessage) //A decade is 10 year.

    val secondName = "Gupta"
    val fullName = "Divya $secondName\n"
    print(fullName) //Divya Gupta

    val mSecondName = "Gupta"
    val mFullName = "Divya ${mSecondName.length}"
    print(mFullName) //Divya 5

}