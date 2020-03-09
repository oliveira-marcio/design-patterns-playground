class Utils {
    companion object {
        fun run(label: String, execute: () -> Unit) {
            println(label)
            execute.invoke()
            println("-------------------------------------")
        }
    }
}
