//reduce duplication

fun main() {
    start()
    addQuotes()

    //not possible
    //  "shayan".quoted()

    //do dont exist my func
    val lsit = listOf(1, 2, 3, 4, 5)
    lsit.forEach() {
        if (it == 3) {
            return@forEach
        }
        println("loop $it")
    }
    println("compelete")

    //custom
    val lsit2 = listOf(1, 2, 3, 4, 5)
    lsit2.forEach customName@ {
        if (it == 3) {
            return@customName
        }
        println("loop $it")
    }
    println("compelete")
}

fun start() {
    val builder = StringBuilder()
    fun log(message: String) = builder.appendLine(message)
    log("status ... ok")
    log("Wings ... ok")
    log("Einginge ... ok")
    println(builder)
}

fun addQuotes() {
    fun String.quoted() = "\"$this\""
    println("shayanxm".quoted())
}