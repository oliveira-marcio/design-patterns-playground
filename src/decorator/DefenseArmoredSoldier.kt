package decorator

class DefenseArmoredSoldier(
    soldier: Soldier,
    private val defenseBonus: Int
) : SoldierArmorDecorator(soldier) {
    override fun defend() {
        println("Doing a super defense with ${super.defense + defenseBonus} of power")
    }
}
