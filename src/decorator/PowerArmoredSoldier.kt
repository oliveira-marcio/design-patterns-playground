package decorator

class PowerArmoredSoldier(
    soldier: Soldier,
    private val attackBonus: Int
) : SoldierArmorDecorator(soldier) {
    override fun attack() {
        println("Doing a powerful attack with ${super.offense + attackBonus} of power")
    }
}
