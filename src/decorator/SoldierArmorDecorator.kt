package decorator

abstract class SoldierArmorDecorator(
    private val soldier: Soldier
) : Soldier(
    soldier.health,
    soldier.offense,
    soldier.defense,
    soldier.magic
) {
    override fun attack() {
        soldier.attack()
    }

    override fun defend() {
        soldier.defend()
    }

    override fun status() {
        soldier.status()
    }
}
