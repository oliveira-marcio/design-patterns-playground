package observer

fun main() {
    val tomCruise = FamousActor()
    val paparazzi1 = Paparazzi("Paparazzi1")
    val paparazzi2 = Paparazzi("Paparazzi2")

    Utils.run("Observable initialized - No observers") {
        tomCruise.doAction("went to the beach")
    }

    Utils.run("Subscribing first observer") {
        tomCruise.register(paparazzi1)
    }

    Utils.run("Observable data changed") {
        tomCruise.doAction("had dinner with kids")
    }

    Utils.run("Subscribing second observer") {
        tomCruise.register(paparazzi2)
    }

    Utils.run("Observable data changed") {
        tomCruise.doAction("went to shopping")
    }

    Utils.run("Removing first observer") {
        tomCruise.unregister(paparazzi1)
    }

    Utils.run("Observable data changed") {
        tomCruise.doAction("drove a car")
    }

    Utils.run("Removing second observer") {
        tomCruise.unregister(paparazzi2)
    }

    Utils.run("Observable data changed") {
        tomCruise.doAction("watched a movie")
    }
}
