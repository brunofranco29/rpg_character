package character

import character.subrace.*

data class Character(
    val name: String,
    val race: Race,
    val subrace: Enum<*>? = null, // Sub-raça opcional
    val characterClass: CharacterClass,
    val baseStrength: Int,
    val baseDexterity: Int,
    val baseConstitution: Int,
    val baseIntelligence: Int,
    val baseWisdom: Int,
    val baseCharisma: Int,
    val description: String
) {
    init {
        // Validar que os valores iniciais estão entre 8 e 15
        require(baseStrength in 8..15) { "Strength must be between 8 and 15" }
        require(baseDexterity in 8..15) { "Dexterity must be between 8 and 15" }
        require(baseConstitution in 8..15) { "Constitution must be between 8 and 15" }
        require(baseIntelligence in 8..15) { "Intelligence must be between 8 and 15" }
        require(baseWisdom in 8..15) { "Wisdom must be between 8 and 15" }
        require(baseCharisma in 8..15) { "Charisma must be between 8 and 15" }
    }

    // Função para calcular os atributos finais aplicando bônus raciais
    fun getFinalAttributes(): Map<String, Int> {
        val finalStrength = baseStrength + getRaceBonus("Strength") + getSubraceBonus("Strength")
        val finalDexterity = baseDexterity + getRaceBonus("Dexterity") + getSubraceBonus("Dexterity")
        val finalConstitution = baseConstitution + getRaceBonus("Constitution") + getSubraceBonus("Constitution")
        val finalIntelligence = baseIntelligence + getRaceBonus("Intelligence") + getSubraceBonus("Intelligence")
        val finalWisdom = baseWisdom + getRaceBonus("Wisdom") + getSubraceBonus("Wisdom")
        val finalCharisma = baseCharisma + getRaceBonus("Charisma") + getSubraceBonus("Charisma")

        return mapOf(
            "Strength" to finalStrength,
            "Dexterity" to finalDexterity,
            "Constitution" to finalConstitution,
            "Intelligence" to finalIntelligence,
            "Wisdom" to finalWisdom,
            "Charisma" to finalCharisma
        )
    }

    // Função para obter o bônus racial para um atributo específico
    private fun getRaceBonus(attribute: String): Int {
        return when (race) {
            Race.DWARF -> when (attribute) {
                "Strength" -> 2
                "Constitution" -> 2
                else -> 0
            }
            Race.ELF -> when (attribute) {
                "Dexterity" -> 2
                "Wisdom" -> 1
                else -> 0
            }
            Race.HALFLING -> when (attribute) {
                "Dexterity" -> 2
                "Constitution" -> 1
                else -> 0
            }
            Race.GNOME -> when (attribute) {
                "Intelligence" -> 2
                "Constitution" -> 1
                else -> 0
            }
            Race.DRAGONBORN -> when (attribute) {
                "Strength" -> 2
                "Charisma" -> 1
                else -> 0
            }
            Race.HALF_ORC -> when (attribute) {
                "Strength" -> 2
                "Constitution" -> 1
                else -> 0
            }
            Race.TIEFLING -> when (attribute) {
                "Charisma" -> 2
                "Intelligence" -> 1
                else -> 0
            }
            Race.HALF_ELF -> when (attribute) {
                "Charisma" -> 2
                else -> 0
            }
            Race.HUMAN -> when (attribute) {
                "Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma" -> 1
                else -> 0
            }
        }
    }

    // Função para obter o bônus da sub-raça para um atributo específico
    private fun getSubraceBonus(attribute: String): Int {
        return when (subrace) {
            is DwarfSubrace -> when (attribute) {
                "Strength" -> 2
                else -> 0
            }
            is ElfSubrace -> when (attribute) {
                "Dexterity" -> 2
                else -> 0
            }
            is HalflingSubrace -> when (attribute) {
                "Dexterity" -> 2
                "Constitution" -> 1
                else -> 0
            }
            is GnomeSubrace -> when (attribute) {
                "Intelligence" -> 2
                "Constitution" -> 1
                else -> 0
            }
            else -> 0
        }
    }

    override fun toString(): String {
        val attributes = getFinalAttributes()
        return """
            Name: $name
            Race: $race
            Subrace: ${subrace ?: "None"}
            Class: $characterClass
            Attributes:
              Strength: ${attributes["Strength"]}
              Dexterity: ${attributes["Dexterity"]}
              Constitution: ${attributes["Constitution"]}
              Intelligence: ${attributes["Intelligence"]}
              Wisdom: ${attributes["Wisdom"]}
              Charisma: ${attributes["Charisma"]}
            Description: $description
        """.trimIndent()
    }
}
