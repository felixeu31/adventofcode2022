class CalorieInventory(inventoryPlainText: String) {

    private var _elves = mutableListOf<ElfInventory>()

    init {
        initializeElvesFromPlainText(inventoryPlainText)
    }

    private fun initializeElvesFromPlainText(inventoryPlainText: String) {
        _elves = mutableListOf<ElfInventory>()
        var currentElf = ElfInventory()
        for (item in inventoryPlainText.lines()) {
            if (item == "") {
                _elves.add(currentElf)
                currentElf = ElfInventory()
                continue
            }
            currentElf.addToInventory(item.trim().toLong())
        }
        _elves.add(currentElf)
    }

    fun getTopElvesCalories(number: Int): Long {
        val sortedElves = _elves.sortedByDescending { it.calorieCount }

        return sortedElves.take(number).sumOf { it.calorieCount }
    }

    fun getElfInventories(): MutableList<ElfInventory> {
        return _elves
    }
}