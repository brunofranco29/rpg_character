package character.subrace

import character.Attribute

enum class dwarfSubrace(val attributeBonuses: Map<Attribute, Int>) {
    MOUNTAIN_DWARF(mapOf(Attribute.STRENGTH to 2)),
    HILL_DWARF(mapOf(Attribute.WISDOM to 1))
}