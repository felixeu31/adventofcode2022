import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElvesTests {
    @Test
    fun testname() {

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

        assertEquals(45000, getTopElvesCalories(caloriesList))
    }
}