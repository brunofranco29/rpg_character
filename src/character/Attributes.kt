package character

data class Attributes(
    val strength: Int,
    val dexterity: Int,
    val constitution: Int,
    val intelligence: Int,
    val wisdom: Int,
    val charisma: Int
) {
    companion object {
        private val pointCosts = mapOf(
            8 to 0,
            9 to 1,
            10 to 2,
            11 to 3,
            12 to 4,
            13 to 5,
            14 to 7,
            15 to 9
        )

        fun calculateTotalCost(attributes: Attributes): Int {
            return attributes.strength.pointCost() +
                    attributes.dexterity.pointCost() +
                    attributes.constitution.pointCost() +
                    attributes.intelligence.pointCost() +
                    attributes.wisdom.pointCost() +
                    attributes.charisma.pointCost()
        }

        private fun Int.pointCost(): Int {
            return pointCosts[this] ?: error("Invalid attribute value: $this")
        }
    }
}
