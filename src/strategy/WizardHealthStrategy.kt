package strategy

import kotlin.math.floor

// Estratégia para Magos
class WizardHealthStrategy : HealthStrategy {
    override fun calculateHealth(baseConstitution: Int): Int {
        val constitutionBonus = floor((baseConstitution - 10) / 2.0).toInt()
        return 6 + constitutionBonus // Mago começa com menos vida
    }
}