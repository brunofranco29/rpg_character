package strategy

interface HealthStrategy {
    fun calculateHealth(baseConstitution: Int): Int
}