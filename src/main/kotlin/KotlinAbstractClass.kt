
fun  main(){


    val userList = arrayOf(SilverUser(2),GoldUser(2),DiamondUser(2))


    userReward(userList)


}

fun userRewards(userList: Array<User>) {
    for (user in userList){
        println("Reward ${user.rewardFromShopping()}")
    }
}


/**
 * as Users is the Parent class
 * so it doesn't need to make instance
 * and rewardFromShopping() shouldn't return anything . Cause this method should perform only on it's Child Class
 * That's where  `abstract` come to place. Through `abstract` we can just define the fun signature not the body of it
 * Note : we can't create object of abstract class .
 */
abstract class Users {
    abstract fun rewardFromShopping():Int
}

class  SilverUsers(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping():Int {

        return 100 * numberOfProduct * 1
    }
}

class  GoldUsers(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping(): Int {
        return 150 * numberOfProduct * 2
    }
}
class  DiamondUsers(val numberOfProduct:Int) : User(){
    override fun rewardFromShopping(): Int {
        return 250 * numberOfProduct * 3
    }
}