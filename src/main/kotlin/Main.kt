fun main() {
    createArray("Jane", "Sheila", "cherry", "Gift")
      addition()
    var names=  friends("Joyce","Faith","Ann")
    println(names)
     cities()

}
fun createArray(str1: String, str2: String, str3: String, str4: String) {
    val names = arrayOf(str1, str2, str3, str4)
    println(names.contentToString())
}

fun addition(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val sum = numbers[1] + numbers[4]
    println(sum)

    val index = numbers.indexOf(158)
    println("index of 158")

    val sortedNumbers = numbers.sorted()
    println("Numbers in ascending order:")
}
fun friends(friend1:String, friend2:String, friend3:String ):String{
       var friendsNames= arrayOf(friend1, friend2, friend3)
    return friendsNames.contentToString()
}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodama","jakarta")
    for (city in cities)
     println(city.capitalize())
}





