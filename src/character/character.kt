package character

import character.subrace.*

data class Character(
    val name: String,
    val race: Race,
    val subrace: Enum<*>? = null,
    val characterClass: CharacterClass,
    val attributes: Attributes,
    val description: String // Novo campo de descrição
) {
    val adjustedAttributes: Attributes = applyRacialAndSubracialBonuses()

    private fun applyRacialAndSubracialBonuses(): Attributes {
        val raceBonuses = race.attributeBonuses
        val subraceBonuses = (subrace as? dwarfSubrace)?.attributeBonuses
            ?: (subrace as? elfSubrace)?.attributeBonuses
            ?: (subrace as? halflingSubrace)?.attributeBonuses
            ?: (subrace as? gnomeSubrace)?.attributeBonuses
            ?: emptyMap()

        return Attributes(
            strength = attributes.strength + (raceBonuses[Attribute.STRENGTH] ?: 0) + (subraceBonuses[Attribute.STRENGTH] ?: 0),
            dexterity = attributes.dexterity + (raceBonuses[Attribute.DEXTERITY] ?: 0) + (subraceBonuses[Attribute.DEXTERITY] ?: 0),
            constitution = attributes.constitution + (raceBonuses[Attribute.CONSTITUTION] ?: 0) + (subraceBonuses[Attribute.CONSTITUTION] ?: 0),
            intelligence = attributes.intelligence + (raceBonuses[Attribute.INTELLIGENCE] ?: 0) + (subraceBonuses[Attribute.INTELLIGENCE] ?: 0),
            wisdom = attributes.wisdom + (raceBonuses[Attribute.WISDOM] ?: 0) + (subraceBonuses[Attribute.WISDOM] ?: 0),
            charisma = attributes.charisma + (raceBonuses[Attribute.CHARISMA] ?: 0) + (subraceBonuses[Attribute.CHARISMA] ?: 0)
        )
    }
}
