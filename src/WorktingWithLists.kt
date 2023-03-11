fun main() {

   zipper()
//
    unzipper()
// mixer

    mixer()

}

private fun mixer() {
    val list = listOf(
        listOf(1, 2),
        listOf(9, 4),
        listOf(1, 6),
        listOf(7, 7),
    )
    println(list.flatten())
}

private fun unzipper() {
    val ids = listOf(10, 11, 12)
    val names = listOf("shayan", "ali", "mamd")
    val result = ids.zip(names) { id, name ->
        Persona(id = id, name = name)
    }
    println(result)
//unziping

    val numbresMap = mapOf(1 to "One", 2 to "Two", 3 to "Four")
    println(numbresMap.toList())
    val (numbers, texts) = numbresMap.toList().unzip()
    println(numbers)

    println(texts)
}

/**
 * zipps to list to a map
 */
private fun zipper() {
    val first = listOf("a", "b", "c", "d")
    val second = listOf(1, 2, 3, 4)

    val zipped = first.zip(second)
    println(zipped)
    //zip with size of shortes list
    println(first.zip(0..10))
    println((0..10).zip(second))
}

data class Persona(
    val id:Int,
    val name:String
)