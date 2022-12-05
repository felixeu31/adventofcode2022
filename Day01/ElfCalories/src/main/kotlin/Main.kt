import java.io.File

fun main() {

    val allElvesCalorieInventories = readFileAsLinesUsingReadLines("./input.txt")

    val elves = getElves(allElvesCalorieInventories)

    println("Number of elves: " + elves.count())
    println("Total amount of calories of all elves: " + elves.sumOf { it.calorieCount})
    println("Max amount of calories of a single elf: " + elves.maxBy { it.calorieCount }.calorieCount)
}

private fun getElves(allElvesCalorieInventories: List<String>): MutableList<Elf> {
    val elves = mutableListOf<Elf>()
    var elfCount = 1
    var currentElf = Elf(elfCount)
    for (item in allElvesCalorieInventories) {
        if (item == "") {
            elves.add(currentElf)
            elfCount++
            currentElf = Elf(elfCount)
            continue
        }
        currentElf.addToInventory(item.toLong())
    }
    return elves
}

fun readFileAsLinesUsingReadLines(fileName: String): List<String>
        = File(fileName).readLines()

class Elf(elfNumber: Number)  {
    var calorieCount: Long = 0

    fun addToInventory(calories: Long){
        calorieCount += calories
    }
}