package observer

class Paparazzi(private val name: String) : Observer {
    override fun onReceiveUpdate(action: String) {
        println("$name: Tom Cruise $action")
    }
}
