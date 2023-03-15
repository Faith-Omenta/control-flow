fun main() {
    oddNums()
    var s = family(arrayOf("Melvin","Bonvick","Omenta","Glenah"))
    println(s)
    robot(14)
    robot(6)
    robot(28)
    people()

}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun oddNums(){
    for (nums in 1..100){
    if (nums % 2!=0){
        println(nums)
    }
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun family(name:Array<String>):Int{
    var addition=0
    for (names in name){
        if (names.length>5){
            addition++
        }
    }
    return addition
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robot(age:Int){
    if (age in 0..6){
        println("milk")}
        else if (age in 7..14){
            println("fanta orange")
        }
    else{
        println("coca cola")
    }

}



//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun people() {
    for (nums in 1..100)
        when{
            nums % 3 ==0->
                println("Fizz")
            nums % 5==0->
                println("Buzz")
                nums % 3 ==0 && nums % 5==0->
                    println("FizzBuzz")
        }
}