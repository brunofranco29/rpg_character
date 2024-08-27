package character.subrace

import character.Attribute

enum class gnomeSubrace(val attributeBonuses: Map<Attribute, Int>) {
    FOREST_GNOME(mapOf(Attribute.DEXTERITY to 1)),
    ROCK_GNOME(mapOf(Attribute.CONSTITUTION to 1))
}