import character.Character
import character.Race
import character.CharacterClass
import character.Attributes
import character.subrace.*

fun main() {
    val attributes1 = Attributes(
        strength = 15,
        dexterity = 14,
        constitution = 13,
        intelligence = 10,
        wisdom = 10,
        charisma = 8
    )

    val character1 = Character(
        name = "Thorin",
        race = Race.DWARF,
        subrace = dwarfSubrace.MOUNTAIN_DWARF,
        characterClass = CharacterClass.FIGHTER,
        attributes = attributes1,
        description = "Thorin is a seasoned warrior from the Iron Hills, known for his unmatched skill in battle."
    )

    val attributes2 = Attributes(
        strength = 10,
        dexterity = 15,
        constitution = 14,
        intelligence = 13,
        wisdom = 10,
        charisma = 8
    )

    val character2 = Character(
        name = "Elrond",
        race = Race.ELF,
        subrace = elfSubrace.HIGH_ELF,
        characterClass = CharacterClass.WIZARD,
        attributes = attributes2,
        description = "Elrond is a wise and powerful High Elf wizard, with knowledge spanning centuries."
    )

    val attributes3 = Attributes(
        strength = 10,
        dexterity = 14,
        constitution = 12,
        intelligence = 11,
        wisdom = 13,
        charisma = 15
    )

    val character3 = Character(
        name = "Frodo",
        race = Race.HALFLING,
        subrace = halflingSubrace.LIGHTFOOT_HALFLING,
        characterClass = CharacterClass.ROGUE,
        attributes = attributes3,
        description = "Frodo is a light-footed halfling rogue from the Shire, known for his agility and stealth."
    )

    printCharacterInfo(character1)
    printCharacterInfo(character2)
    printCharacterInfo(character3)
}

fun printCharacterInfo(character: Character) {
    println("Name: ${character.name}")
    println("Race: ${character.race}")
    println("Subrace: ${character.subrace ?: "None"}")
    println("Class: ${character.characterClass}")
    println("Attributes: ${character.adjustedAttributes}")
    println("Description: ${character.description}")
    println()
}
