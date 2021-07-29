fun main() {

    //init project

    //Basic Types

    var a = 10 + 6;
    //re-assignable
    var value: Int = 10
    value = 15
    println(value)

    //data type
    var vInt: Int = 12
    var vDouble: Double = 12.4
    var vFloat: Float = 34.5f
    var vChar: Char = 'M'
    var vString: String = "Kotlin"
    var vBoolean: Boolean = true

    //we can use underscores to make number constants more readable
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L

    println(45 == 54)

    println(vString)


    var convertedInt: Int = vDouble.toInt()
    println("Converted Int value $convertedInt")

    println("Summation of 2+3 is ${2 + 3}")
    println("Summation of 2+3 is " + (2 + 3))//result is 5
    println("Summation of 2+3 is " + 2 + 3)//result is 23


    //arithmetical  Operation
    println(4 + 5) // 9
    println(2.5 * 2) //5.0
    println(5 / 2) //2
    println(5 / 2.0) //2.5
    val x = 5 / 2.toDouble()
    println(x) // 2.5

    //initial null value
    var abc: Int? = null
    println(abc)


    //string

    var s: String = "kotlin"
    //concatenating
    println(s.plus(".KT"))

    val upperS: String = s.toUpperCase()
    println(upperS)
    // length of a string

    println("Length of $s is ${s.length}")

    val price = """${'$'}_9.99"""
    println(price)
}