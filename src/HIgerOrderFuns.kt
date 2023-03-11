//these are funs acc oder funs as argument or prdouce fun as result
fun main() {
    higherOrder()


    repeat(times = 5,){index ->
        println("$index")
        
    }

}

private fun higherOrder() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val moreThanTwo: (Int) -> Boolean = {
        it > 2

    }
    val res = numbers.any(moreThanTwo)
    print(res)
}