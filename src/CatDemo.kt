
fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    // Calling walk method on each object
    binnie.walk()
    clyde.walk()

    // Calling eat method on each object
    binnie.eat()
    clyde.eat()

    // println(objectName) - automatically calls the toString() method
    // to determine how the object should be displayed.
    println(binnie)
    println(clyde)
}