package character.subrace


import character.Attribute

enum class elfSubrace(val attributeBonuses: Map<Attribute, Int>) {
    HIGH_ELF(mapOf(Attribute.INTELLIGENCE to 1)),
    WOOD_ELF(mapOf(Attribute.WISDOM to 1)),
    DROW(mapOf(Attribute.CHARISMA to 1))
}