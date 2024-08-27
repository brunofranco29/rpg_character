package character

enum class Race(val attributeBonuses: Map<Attribute, Int>) {
    DWARF(mapOf(Attribute.CONSTITUTION to 2)),
    ELF(mapOf(Attribute.DEXTERITY to 2)),
    HALFLING(mapOf(Attribute.DEXTERITY to 2)),
    GNOME(mapOf(Attribute.INTELLIGENCE to 2)),
    DRAGONBORN(mapOf(Attribute.STRENGTH to 2, Attribute.CHARISMA to 1)),
    HALF_ORC(mapOf(Attribute.STRENGTH to 2, Attribute.CONSTITUTION to 1)),
    TIEFLING(mapOf(Attribute.INTELLIGENCE to 1, Attribute.CHARISMA to 2)),
    HALF_ELF(mapOf(Attribute.CHARISMA to 2)),
    HUMAN(mapOf(
        Attribute.STRENGTH to 1,
        Attribute.DEXTERITY to 1,
        Attribute.CONSTITUTION to 1,
        Attribute.INTELLIGENCE to 1,
        Attribute.WISDOM to 1,
        Attribute.CHARISMA to 1
    ))
}
