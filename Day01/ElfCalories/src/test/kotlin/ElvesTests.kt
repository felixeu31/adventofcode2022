import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElvesTests {

    val caloriesList = """1000
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

        val elfInventories = mutableListOf<Elf>()

        val elfInventoryList = getElves(caloriesList)

        assertEquals(5, elfInventoryList.size)
    }

    @Test
    fun testname() {



        assertEquals(45000, getTopElvesCalories(caloriesList))
    }
}