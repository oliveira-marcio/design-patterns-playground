package decorator

abstract class Soldier(
    val health: Int,
    val offense: Int,
    val defense: Int,
    val magic: Int
) {
    abstract fun attack()
    abstract fun defend()
    abstract fun status()
}
