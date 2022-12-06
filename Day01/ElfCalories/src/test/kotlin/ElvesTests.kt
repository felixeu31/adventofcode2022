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
        val elfInventoryList = getElves(caloriesList)

        assertEquals(5, elfInventoryList.size)
    }

    @Test
    fun calculate_top_elves_calories() {
        val topElvesCalories = getTopElvesCalories(caloriesList)

        assertEquals(45000, topElvesCalories)
    }
}