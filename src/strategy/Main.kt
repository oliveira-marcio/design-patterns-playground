package strategy

fun main() {
    val fastAndLoudDog = Dog("Dog1", HighBarkBehavior(), FastWalkBehavior())
    val fastAndQuietDog = Dog("Dog2", LowBarkBehavior(), FastWalkBehavior())
    val slowAndLoudDog = Dog("Dog3", HighBarkBehavior(), SlowWalkBehavior())
    val slowAndQuietDog = Dog("Dog4", LowBarkBehavior(), SlowWalkBehavior())

    Utils.run("Fast And Loud Dog") {
        fastAndLoudDog.bark()
        fastAndLoudDog.walk()
    }

    Utils.run("Fast And Quiet Dog") {
        fastAndQuietDog.bark()
        fastAndQuietDog.walk()
    }

    Utils.run("Slow And Loud Dog") {
        slowAndLoudDog.bark()
        slowAndLoudDog.walk()
    }

    Utils.run("Slow And Quiet Dog") {
        slowAndQuietDog.bark()
        slowAndQuietDog.walk()
    }
}
