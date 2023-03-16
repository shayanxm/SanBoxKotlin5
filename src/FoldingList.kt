fun main() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.fold(initial = 0) { sum, nummber ->
        println("INitial: $sum, Nummber: $nummber")
        sum + nummber

    }
    foldRep()

    println("final : $result")

    val result2 = list.foldRight(initial = 0) { sum, nummber ->
        println("INitial: $sum, Nummber: $nummber")
        sum + nummber

    }


//no initial value
    val result3 = list.reduce() { sum, nummber ->
        println("INitial: $sum, Nummber: $nummber")
        sum + nummber

    }
    println("final : $result3")
//returns a list (storing all numbers from lambda)
    val result4 = list.runningFold(initial = 1) { sum, nummber ->
        println("INitial: $sum, Nummber: $nummber")
        sum + nummber

    }
    println("final : $result4")

    val result5 = list.runningReduce() { sum, nummber ->
        println("INitial: $sum, Nummber: $nummber")
        sum + nummber

    }
    println("final : $result5")
}

//otherway (manual way)
fun foldRep() {
    val list = listOf(1, 10, 100, 1000)
    var accumulator = 0
    val operation = { sum: Int, nummber: Int -> sum + nummber }
    for (nummber in list) {
        accumulator = operation(accumulator, nummber)
    }
    println(accumulator)
}
