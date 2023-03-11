import java.util.*
import kotlin.random.Random

fun main() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map { numbers ->

        "\"${numbers}\""

    }
    val quotedNumbersx = numbers.map(transform = { numbers ->
        "\"${numbers}\""
    })
    println(quotedNumbers)

    val quotingNum = numbers.joinToString { numbers: Int ->
        "\"${numbers}\""
    }
    println(quotingNum)

    val quoted = { numbers: Int -> "\"${numbers}\"" }
    val quotedNum3 = numbers.joinToString(transform = quoted)
    val quotedNum4 = numbers.mapIndexed { _, numbers ->
        "\"${numbers}\""
    }
    button(onCLick = {
        print("clicked")
    })
    button { print("clicked") }
    butotn2 {random->
        "$random"
    }
}

fun button(onCLick: () -> Unit) {
    onCLick()

}
fun butotn2(onClick: (Int)-> String){
    onClick(Random.nextInt(from = 0, until = 199))
}