import character.Character
import character.Race
import character.CharacterClass
import character.subrace.*

fun main() {
    // Criando o personagem Thorin
    val thorin = Character(
        name = "Thorin",
        race = Race.DWARF,
        subrace = DwarfSubrace.MOUNTAIN_DWARF,
        characterClass = CharacterClass.FIGHTER,
        baseStrength = 15,
        baseDexterity = 10,
        baseConstitution = 14,
        baseIntelligence = 10,
        baseWisdom = 12,
        baseCharisma = 8,
        description = "Rei sob a montanha, em busca de recuperar seu reino perdido."
    )

    // Criando o personagem Elrond
    val elrond = Character(
        name = "Elrond",
        race = Race.ELF,
        subrace = ElfSubrace.HIGH_ELF,
        characterClass = CharacterClass.WIZARD,
        baseStrength = 10,
        baseDexterity = 14,
        baseConstitution = 12,
        baseIntelligence = 15,
        baseWisdom = 13,
        baseCharisma = 14,
        description = "Senhor de Valfenda, sábio e imortal."
    )

    // Criando o personagem Frodo
    val frodo = Character(
        name = "Frodo",
        race = Race.HALFLING,
        subrace = HalflingSubrace.LIGHTFOOT_HALFLING,
        characterClass = CharacterClass.ROGUE,
        baseStrength = 8,
        baseDexterity = 14,
        baseConstitution = 13,
        baseIntelligence = 12,
        baseWisdom = 10,
        baseCharisma = 14,
        description = "Pequeno hobbit com uma grande missão, portador do Anel."
    )

    // Criando o personagem Drizzt
    val drizzt = Character(
        name = "Drizzt",
        race = Race.ELF,
        subrace = ElfSubrace.DROW,
        characterClass = CharacterClass.RANGER,
        baseStrength = 13,
        baseDexterity = 15,
        baseConstitution = 14,
        baseIntelligence = 12,
        baseWisdom = 13,
        baseCharisma = 10,
        description = "Drow renegado, mestre das lâminas, e defensor dos fracos."
    )

    // Criando o personagem Gandalf
    val gandalf = Character(
        name = "Gandalf",
        race = Race.HUMAN,
        subrace = null,
        characterClass = CharacterClass.WIZARD,
        baseStrength = 10,
        baseDexterity = 10,
        baseConstitution = 12,
        baseIntelligence = 15,
        baseWisdom = 14,
        baseCharisma = 13,
        description = "Mago sábio e poderoso, guia dos povos livres."
    )

    // Exibindo os personagens criados
    println(thorin)
    println()
    println(elrond)
    println()
    println(frodo)
    println()
    println(drizzt)
    println()
    println(gandalf)
}