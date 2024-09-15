import character.Character
import character.Race
import character.CharacterClass
import character.subrace.*
import strategy.*

fun main() {
    // Criando personagens com diferentes classes e verificando a vida calculada
    val frodo = Character(
        name = "Frodo",
        race = Race.HALFLING,
        subrace = HalflingSubrace.LIGHTFOOT_HALFLING,
        characterClass = CharacterClass.ROGUE, // Ladino
        baseStrength = 8,
        baseDexterity = 14,
        baseConstitution = 13,
        baseIntelligence = 12,
        baseWisdom = 10,
        baseCharisma = 14,
        description = "Pequeno hobbit com uma grande missão, portador do Anel."
    )

    val drizzt = Character(
        name = "Drizzt",
        race = Race.ELF,
        subrace = ElfSubrace.DROW,
        characterClass = CharacterClass.BARBARIAN, // Bárbaro
        baseStrength = 13,
        baseDexterity = 15,
        baseConstitution = 14,
        baseIntelligence = 12,
        baseWisdom = 13,
        baseCharisma = 10,
        description = "Drow renegado, mestre das lâminas, e defensor dos fracos."
    )

    val gandalf = Character(
        name = "Gandalf",
        race = Race.HUMAN,
        subrace = null,
        characterClass = CharacterClass.WIZARD, // Mago
        baseStrength = 10,
        baseDexterity = 10,
        baseConstitution = 12,
        baseIntelligence = 15,
        baseWisdom = 14,
        baseCharisma = 13,
        description = "Mago sábio e poderoso, guia dos povos livres."
    )

    // Imprimindo informações dos personagens
    println(frodo)
    println(drizzt)
    println(gandalf)
}