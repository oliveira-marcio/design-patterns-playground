package observer

class FamousActor : Observable {
    private val observers: MutableList<Observer> = mutableListOf()
    private var action: String = ""

    override fun register(observer: Observer) {
        observers.add(observer)
        observer.onReceiveUpdate(action)
    }

    override fun unregister(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.onReceiveUpdate(action)
        }
    }

    fun doAction(action: String) {
        this.action = action
        println("New action: $action")
        notifyObservers()
    }
}
