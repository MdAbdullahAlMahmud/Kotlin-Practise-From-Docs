
fun  main(){
    /**
     *create object of silver user
     */
    var silver = SilverUser(2)
    println("Reward Coin ${silver.rewardFromShopping()}")

    var goldUser = GoldUser(2)
    println("Reward Coin ${goldUser.rewardFromShopping()}")


    /**
     * so the type of array is User
     * so any parent class can the object of child like
     *  var user : User = SilverUser(1)
     *  var user : User = GoldSilverUser(1)
     *  var user : User = DiamondUser(1)
     */
    var user : User = SilverUser(1) // valid reference
    // var user1 : GoldUser = SilverUser(1) // invalid  reference
    //var user2 : GoldUser = User() // invalid  reference



    val userList = arrayOf(SilverUser(2),GoldUser(2),DiamondUser(2))


        userReward(userList)


}

fun userReward(userList: Array<User>) {
    for (user in userList){
        println("Reward ${user.rewardFromShopping()}")
    }
}


open class User {
    open fun rewardFromShopping():Int {
        return 0
    }
}

class  SilverUser(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping():Int {

        return 100 * numberOfProduct * 1
    }
}

class  GoldUser(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping(): Int {
        return 150 * numberOfProduct * 2
    }
}
class  DiamondUser(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping(): Int {
        return 250 * numberOfProduct * 3
    }
}