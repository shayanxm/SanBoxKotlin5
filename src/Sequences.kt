//named stream in other programing langs

fun main() {
val list= listOf(1,2,3,4)
    //horizonatl evaluation
    //before next operation all are performed
    println("---lsit---")

   // list.filter { it %2 ==0 }.map { it * it }.any{it <10}
list.filter(Int::isEven)
    .map (Int::square)
    .any(Int::lessThanTen)


    println("---sequance---")
    //lazy operation
    //
    list.asSequence()
        .filter(Int::isEven)
        .map (Int::square)
        .any(Int::lessThanTen)
}
fun Int.isEven(): Boolean{
    println("isEven ")
    return this % 2 == 0
}
fun Int.square():Int{
    println("square")
    return this *this
}
fun Int.lessThanTen(): Boolean{
    println("lessthatn ten")
    return this < 10
}