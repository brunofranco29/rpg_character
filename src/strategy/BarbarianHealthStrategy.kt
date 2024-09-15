package strategy

import kotlin.math.floor

// Estratégia para Bárbaros
class BarbarianHealthStrategy : HealthStrategy {
    override fun calculateHealth(baseConstitution: Int): Int {
        val constitutionBonus = floor((baseConstitution - 10) / 2.0).toInt()
        return 12 + constitutionBonus // Bárbaro começa com mais vida
    }
}