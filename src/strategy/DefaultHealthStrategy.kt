package strategy

import kotlin.math.floor

// Implementação da estratégia de cálculo de vida padrão
class DefaultHealthStrategy : HealthStrategy {
    override fun calculateHealth(baseConstitution: Int): Int {
        val constitutionBonus = floor((baseConstitution - 10) / 2.0).toInt()
        return 10 + constitutionBonus
    }
}