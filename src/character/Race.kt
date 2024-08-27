package character

import character.subrace.DwarfSubrace
import character.subrace.ElfSubrace
import character.subrace.GnomeSubrace
import character.subrace.HalflingSubrace

enum class Race(val subraces: List<Any>?) {
    DWARF(listOf(DwarfSubrace.MOUNTAIN_DWARF, DwarfSubrace.HILL_DWARF)),
    ELF(listOf(ElfSubrace.HIGH_ELF, ElfSubrace.WOOD_ELF, ElfSubrace.DROW)),
    HALFLING(listOf(HalflingSubrace.STOUT_HALFLING, HalflingSubrace.LIGHTFOOT_HALFLING)),
    GNOME(listOf(GnomeSubrace.FOREST_GNOME, GnomeSubrace.ROCK_GNOME)),
    DRAGONBORN(null),  // Draconato
    HALF_ORC(null),    // Meio-Orc
    TIEFLING(null),    // Tiefling
    HALF_ELF(null),    // Meio-Elfo
    HUMAN(null)        // Humano
}
