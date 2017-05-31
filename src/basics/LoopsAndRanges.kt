package basics

/**
 * Created by divya on 31/05/17.
 */

fun main(args: Array<String>) {

    for (a: Int in 1..10)
    {
        println(a) //12345678910
    }

    for (b in 1..10)
    {
        println(b) //12345678910
    }

    val mNumber = 1..10
    for (c in mNumber)
    {
        println(c) //12345678910
    }

    for (d in 10 downTo 1)
    {
        println(d) //10987654321
    }

    /*for (e in 10..1)
    {
        println(e)
    }*/

    for(f in 10 downTo 1 step 2)
    {
        println(f) //108642
    }

    val capitals = listOf("London", "Paris", "Rome")
    for (capital in capitals)
    {
        println(capital) //London,Paris,Rome
    }

    var i = 10
    while (i>0)
    {
        i--
        println(i) //9876543210
    }

    /*do {
        var x=10
        x--
        println(x)
    }while (x>10)
*/

  /* loop@ for (i in 1..10){
        for (j in 1..10){
            if (j % i==0){
                break@loop
            }
        }
    }*/
}