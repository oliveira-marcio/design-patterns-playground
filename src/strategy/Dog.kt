package strategy

class Dog(
    private val name: String,
    private val barkBehavior: BarkBehavior,
    private val walkBehavior: WalkBehavior
) {
    fun bark() {
        print("I'm $name! ")
        barkBehavior.bark()
    }

    fun walk() {
        print("I'm $name! ")
        walkBehavior.walk()
    }
}
