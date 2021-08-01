import kotlin.math.max

fun main(){
    /*val a = 10
    val b = 20
    var max :Int
    if (a>b){
        max = a
    }else{
        max = b
    }
    println("Max Number $max")

    // can be formatted as
    max = if (a>b){
         a
    }else{
        b
    }
    println("Max Number $max")


    // as expression
     val maximum_num = if (a>b) a else b
    println("Maximum $maximim_num")

    println("Max ${max(a,b)}")


    // same like switch case statement
    var num : Int? = 5
    when(num){
        1 -> println("Number is ${1}")
        2 -> println("Number is ${2}")
        3 -> println("Number is ${3}")
        4 -> println("Number is ${4}")
        5 -> {
            println("In Our Range")
            println("Number is ${5}")

        }
        else ->{
            println("Unknown Number")
        }
    }*/
   /* var n = 20
    when(n){
        // if  n  number is 0 or 2 or 5 or 6 in that case

        0,2,5,6 -> {
            println("Number is in our Stock")
        }
        else -> {
            println("Not in our Stock")
        }
    }


    var validSeries = intArrayOf(1,2,5,6)
    when(n){
        in 1..10 -> {
            println("Number is in  Range")
        }
        in validSeries ->{
            println("On Valid Series")
        }
        !in validSeries ->{
            println("Out of valid series")
        }
        else ->{
            println("UnKnown Range")
        }
    }*/



    var givenNumber = 5
    // `when` can also act like if else clause when its has no parameter
    when{
        givenNumber>5 ->{
            println("$givenNumber is greater than 5")
        }

        givenNumber ==5 ->{
            println("$givenNumber is equals to 5")
        }
        else ->{
            println("$givenNumber is less than 5")
        }
    }


}