import java.io.File

fun main() {
    val inventoryPlainText = File("./input.txt").readText()
    val elves = getElves(inventoryPlainText)

    println("Number of elves: " + elves.count())
    println("Total amount of calories of all elves: " + elves.sumOf { it.calorieCount})
    println("Max amount of calories of a single elf: " + elves.maxBy { it.calorieCount }.calorieCount)

    println("Top 3 elves: " + getTopElvesCalories(inventoryPlainText))
}

fun getElves(inventoryPlainText: String): MutableList<Elf> {
    val elves = mutableListOf<Elf>()
    var currentElf = Elf()
    for (item in inventoryPlainText.lines()) {
        if (item == "") {
            elves.add(currentElf)
            currentElf = Elf()
            continue
        }
        currentElf.addToInventory(item.trim().toLong())
    }
    elves.add(currentElf)
    return elves
}

class Elf()  {
    var calorieCount: Long = 0

    fun addToInventory(calories: Long){
        calorieCount += calories
    }
}



fun getTopElvesCalories(caloriesList: String): Long {

    val elves = getElves(caloriesList)

    val sortedElves = elves.sortedByDescending { it.calorieCount }

    return sortedElves.take(3).sumOf { it.calorieCount }
}