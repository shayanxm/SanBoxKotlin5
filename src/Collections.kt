fun main() {
 collectionsLambdas()

   anyCrateor()
    taker()

}

private fun collectionsLambdas() {
    val list1 = List(size = 10) { it }
    val list2 = MutableList(size = 10) { it }
    println(list1)
    println(list2)
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numbersList.filter { number ->
        number > 5
    })
    println(numbersList.filterIndexed { index, number ->
        index == 0
    })

    println(numbersList.filterNot { number ->
        number == 1
    })
    val numbersList2 = listOf(1, null, null, 4, 5, 6, 7, 8, 9)

    println(numbersList2.filterNotNull())
    println(numbersList2.count { number ->
        number == 5
    })
    val numberList3 = listOf(2, 2, 2, 3, 4, 4, 5, 5, 6)
    println(numberList3.count { number ->
        number == 5
    })
    println(numberList3.count())
    val findedPart = numberList3.find { number ->
        number == 3
    }
    print(findedPart)
    println(numbersList.firstOrNull())
    println(numbersList.lastOrNull())
}

/**
 * filtering and partioning
 */
fun anyCrateor() {
    val numberList3 = listOf(2, 2, 2, 3, 4, 4, 5, 5, 6)
    println(numberList3.any { number ->
        number == 1
    })
    println(numberList3.all { number ->
        number > 0
    })
    println(numberList3.none { number ->
        number > 4
    })
    //partition
    val (match, noMatch) = numberList3.partition { number ->
        number < 6

    }
    println(match)
    println(noMatch)
    val randonNumbs = listOf(2, 3, 4, 3, 2, 5, 3, 10, 3, 2, 4, 3, 2)
    println(randonNumbs.sum())
    println(randonNumbs.sorted())
    println(randonNumbs.sortedDescending())

    val personList = listOf(
        Personz(name = "shayan", age = 22),
        Personz(name = "shayan", age = 2),
        Personz(name = "shayan", age = 21),
        Personz(name = "shayan", age = 23)
    )
println(personList.sumOf { person->
    person.age
})
    println(personList.sortedBy { perosn ->
        perosn.age
    })
}
fun taker(){
    val randonNumbs = listOf(2, 3, 4, 3, 2, 5, 3, 10, 3, 2, 4, 3, 2)
println(randonNumbs.take(4))
    println(randonNumbs.drop(n = 3))

}

data class Personz(
    val name: String,
    val age: Int
)