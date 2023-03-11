fun main() {
  // noLamdaEzLife()

  //  topLvlRef()

    ConstractorRef()

}

private fun ConstractorRef() {
    val names = listOf("Dog", "Cat")
    println(names.mapIndexed { index, name ->
        Animal(id = index, name = name)
    })
    /**
     * esier Way
     */
    println(names.mapIndexed(::Animal))
}

private fun topLvlRef() {
    val people = listOf(
        Person(name = "shayan", age = 22, male = true),
        Person(name = "kimi", age = 23, male = false),
        Person(name = "shayan", age = 42, male = true),
        Person(name = "zahra", age = 22, male = false),
    )
    println(people.any(Person::important))
    println(people.any(::important2))
}

fun important2(person:Person)=person.name.startsWith("s")&&person.age>20
fun Person.important()=this.name.startsWith("s")&&this.age>20

private fun noLamdaEzLife() {
    val people = listOf(
        Person(name = "shayan", age = 22, male = true),
        Person(name = "kimi", age = 23, male = false),
        Person(name = "shayan", age = 42, male = true),
        Person(name = "zahra", age = 22, male = false),
    )
    people.filter { person ->
        person.male
    }.forEach { println(it.name) }
    people.filter { person ->
        !person.male
    }.forEach { println(it.name) }


    /**
     * esaier way
     */
    people.filter(Person::male).forEach { println(it.name) }
    people.filterNot(Person::male).forEach { println(it.name) }
    people.sortedBy(Person::age).forEach { println(it.name) }
}

data class Person(
    val name:String,
    val age:Int,
    val male:Boolean
)
data class Animal(
    val id:Int,
    val name:String

)