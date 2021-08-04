 open class  KotlinClass {

    var a: Int? = null
    init {
        a = 40
    }
     constructor( name: String)  {

     }
    constructor(name :String , age : Int):this(name){
        println("Second constructor is called")
    }


     /**
      * if we want to make this class to be parent class for another one then
      * in order to inherit any fun , we have to make it open cause by default all class & fun are final
      */

     open fun display() {
        println("Value of a is $a")

    }
}

fun main() {

    var my_class = KotlinClass("Munna")
    my_class.display()

    val derievedClass = ChildClass("Munna",18,"Naogaon")
    derievedClass.display()
    derievedClass.phone = "01782462614"
    println("Phone ${derievedClass.phone.length}")
}

class ChildClass : KotlinClass {

    var name :String? = null
    var address :String? = null
    var age :Int? = null
    var phone : String = "01782462614"



    /**
     * constructor
     * we are initializing name & age properties by the parent class's properties
     */
    constructor(name :String , age : Int , address :String ): super(name,age){
       this.name= name
       this.age = age
       this.address = address
    }


    /**
     * override properties
     */
    override fun display() {
        super.display()
        println("Address $address")
    }
}

