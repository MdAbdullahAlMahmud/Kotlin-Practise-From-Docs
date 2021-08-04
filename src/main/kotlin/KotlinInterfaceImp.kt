class KotlinInterfaceImp(override var n: Int = 100) : KotlinInterface,ChildInterface{


    override fun sum(a : Int, b: Int): Int {
        return  a+b
    }

    override fun multiplication(a: Int, b: Int): Int {
        return  a *b
    }

    override fun subtraction(a: Int, b: Int): Int {

        return  a-b
    }

    override fun division(a: Double, b: Double): Double {
        return a/b
    }
}

fun  main(){
    val calculator = KotlinInterfaceImp()

    println("Summation is ${calculator.sum(5,5)}")
    println("Subtraction is ${calculator.subtraction(5,5)}")
    println("Multiplication is ${calculator.multiplication(5,5)}")
    println("Division is ${calculator.division(50.0,5.0)}")
    println("Value of member is  ${calculator.n}")
}

interface  ChildInterface : KotlinInterface{
    fun  subtraction (a: Int ,b: Int) : Int
    fun  division ( a : Double ,  b : Double) : Double

}