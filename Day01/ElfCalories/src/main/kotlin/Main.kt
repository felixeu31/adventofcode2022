import java.io.File

fun main() {
    val inventoryPlainText = File("./input.txt").readText()
    val calorieInventory = CalorieInventory(inventoryPlainText)

    println("Number of elves: " + calorieInventory.getElfInventories().count())
    println("Total amount of calories of all elves: " + calorieInventory.getElfInventories().sumOf { it.calorieCount})
    println("Max amount of calories of a single elf: " + calorieInventory.getElfInventories().maxBy { it.calorieCount }.calorieCount)
    println("Top 3 elves: " + calorieInventory.getTopElvesCalories(3))
}