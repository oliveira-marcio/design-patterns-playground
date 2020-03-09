package strategy

class SlowWalkBehavior : WalkBehavior {
    override fun walk() {
        println("I'm too slow!")
    }
}
