//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    buns("Barnie bakes brown bagels and burns")
    arrayOfNumbers(arrayOf(20.9,40.6,43.9))
    volumeOfSphere(2.0,3.14159 )
    println(isPalindrome("pawpaw"))
    println(isPalindrome("mom"))
    findPalindrome("wow")

}

fun buns(word:String){
    var spliting=word.lowercase()
    var b = spliting.split("b",)
    println(b)
//    var sentence = "Barnie bakes brown bagels and burns"


}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun arrayOfNumbers(numbers:Array<Double>){
    println(numbers.sum())
    println(numbers.count())
    println(numbers.size)
    println(numbers.sum() / numbers.count())
    println(numbers.average())

}

//The volume of a sphere is calculated using the formula below
//V = 4/3 π r3
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun volumeOfSphere(radius:Double,pie:Double){
   var volume=4.0 /3.0 *radius*radius*radius*pie
   println(volume)
};

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.

fun isPalindrome(word: String):Boolean{
    var newWord=word.lowercase()
    return newWord == newWord.reversed()
}
fun findPalindrome(word: String):Boolean{
    var a = 0
    var b = word.length -1
    while (a<b){
        if (word[a] != word[b]){
          return false
        }
        a++
        b--
    }
    return true
}