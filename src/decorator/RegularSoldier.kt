package decorator

class RegularSoldier(
    health: Int,
    offense: Int,
    defense: Int,
    magic: Int
) : Soldier(health, offense, defense, magic) {

    override fun attack() {
        println("Doing a regular attack with $offense of power")
    }

    override fun defend() {
        println("Doing a regular defense with $defense of power")
    }

    override fun status() {
        println("My current health is $health and magic is $magic")
    }
}
