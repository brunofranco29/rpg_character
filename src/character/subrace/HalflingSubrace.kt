package character.subrace

import character.Attribute

enum class halflingSubrace(val attributeBonuses: Map<Attribute, Int>) {
    STOUT_HALFLING(mapOf(Attribute.CONSTITUTION to 1)),
    LIGHTFOOT_HALFLING(mapOf(Attribute.CHARISMA to 1))
}