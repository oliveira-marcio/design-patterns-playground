package decorator

fun main() {
    val regularSoldier = RegularSoldier(100, 10, 10, 50)
    val strongSoldier = PowerArmoredSoldier(regularSoldier, 8)
    val royalSoldier = DefenseArmoredSoldier(strongSoldier, 7)
    val magicSoldier = MagicalArmoredSoldier(regularSoldier, 5, 4)
    val divineSoldier = MagicalArmoredSoldier(royalSoldier, 5, 4)

    Utils.run("Regular soldier comes in action!") {
        regularSoldier.status()
        regularSoldier.attack()
        regularSoldier.defend()
    }

    Utils.run("Power soldier comes in action!") {
        strongSoldier.status()
        strongSoldier.attack()
        strongSoldier.defend()
    }

    Utils.run("Royal soldier comes in action!") {
        royalSoldier.status()
        royalSoldier.attack()
        royalSoldier.defend()
    }

    Utils.run("Magic soldier comes in action!") {
        magicSoldier.status()
        magicSoldier.attack()
        magicSoldier.defend()
        magicSoldier.spell()
    }

    Utils.run("Divine soldier comes in action!") {
        divineSoldier.status()
        divineSoldier.attack()
        divineSoldier.defend()
        magicSoldier.spell()
    }
}
