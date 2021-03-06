
/**
 * I am going to learn the basic of Kotlin Loop from official docs
 * @ date 8-1-2021
 */


fun main(){
    /** for loop
     * signature of `for` loop
     * for (item in collection) print(item)
     */

    var nList  = intArrayOf(1,5,3,6,4,8)

    /*for (n in nList){
        println(n)
    }*/

    /**
     * print between range
     */
    for (n in 1..5){
        print("$n ")
    }
    println()


    /**
     * print element with step
     * default initial value is 0 and increasing or decreasing is 0
     * same on  java
     * for (int i = 0 ; i < 10 ; i ++)
     */

    for (i in 0 until 10 step 1 ){
        print("$i ")
    }
    println()
    /**
     * print element with step
     * default initial value is 0 and increasing or decreasing is 0
     * same on  java
     * for (int i = 10 ; i > 5; i --)
     */
    for (i in 10 downTo  5 step 1 ){
        print("$i ")
    }

    println()

    /**
     * print index
     */

    for (index in nList.indices){
        println(index)
    }

    /**
     * print both value and index
     */

    for ((index, value ) in nList.withIndex()){
        println("$index -> $value")
    }

    /**
     * print value with index different approach
     */

    for(index in nList.indices){
        println("nList[$index] = ${nList[index]}")
    }

    /**
     * print value with type declared
     */
    var nStringList = arrayOf<String>("C","Java","Python","Kotlin")

    for (item :String in nStringList){
        println("$item")
    }


    /**
     * while loop
     */

    var x = 10

    while (x>0) {
        print("$x ")
        x--
    }

    println()
    /**
     * do while loop
     */
    var y = 10
    do {
        print("$y ")
        y--
    }while (y>0)

    println()
    /**
     * break statement in Kotlin
     */
    for (i in 0 until 10 step 1){

        if (i==3){
            print("\nBreak statement reach")
            break
        }else{
            print("$i ")
        }
        }
    println()

    /**
     * continue statement in Kotlin
     */
    for (i in 0 until 10 step 1){

        if (i==3){
            continue
        }else{
            print("$i ")
        }
    }


}