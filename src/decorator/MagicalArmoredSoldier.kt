package decorator

class MagicalArmoredSoldier(
    soldier: Soldier,
    private val healthBonus: Int,
    private val magicBonus: Int
) : SoldierArmorDecorator(soldier) {

    override fun status() {
        println("Healthy! My current health is ${super.health + healthBonus} and magic is ${super.magic + magicBonus}")
    }

    fun spell() {
        println("I can cast spells!! Bwahahaha!!")
    }
}
