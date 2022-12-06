import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElvesTests {

    private val caloriesList = """1000
        2000
        3000

        4000

        5000
        6000

        7000
        8000
        9000

        10000"""

    @Test
    fun given_inventory_registry_it_is_processed_to_obtain_each_elf_inventories() {
        val calorieInventory = CalorieInventory(caloriesList)

        assertEquals(5, calorieInventory.getElfInventories().size)
    }

    @Test
    fun calculate_top_elves_calories() {
        val calorieInventory = CalorieInventory(caloriesList)

        assertEquals(45000, calorieInventory.getTopElvesCalories(3))
    }
}