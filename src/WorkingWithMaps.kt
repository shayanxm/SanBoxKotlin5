fun main() {
    val names = listOf("Shayan", "kimia", "mamad", "hasan")
    val ages = listOf(23, 20, 22, 38)
    val people = names.zip(ages) { name, age ->
        Personz(name, age)
    }

    mapCreater(people)

    //assosiatewith
    val map2 = people.associateWith(Personz::name)
    println(map2)

    val map3 = people.associateBy(Personz::name)
    println(map3)

    println(map3.keys)
    println(map3.values)

    println(map3.getOrElse("purexm") { "not found" })

    println(map3.toMutableMap().getOrPut("pureXm") {
        Personz("purexm", 23)
    })
    println(map3.filterKeys { it.startsWith(prefix = "sh") })


    val result = map3.map { (_, value) ->
        "\"${value.name}=${value.age}"
    }
    println(result)


}

private fun mapCreater(people: List<Personz>) {
    println(people)
    val map: Map<Int, List<Personz>> = people.groupBy(Personz::age)
    println(map)
    println(map[23])
}
