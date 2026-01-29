//val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//
//val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
//
//val solarSystem = rockPlanets + gasPlanets
//
//val newSolarSystem = arrayOf(
//    "Mercury",
//    "Venus",
//    "Earth",
//    "Mars",
//    "Jupiter",
//    "Saturn",
//    "Uranus",
//    "Neptune",
//    "Pluto"
//)

fun main() {
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[2])
//    println(newSolarSystem[8])
//    val solarSystem = mutableListOf(
//        "Mercury", "Venus", "Earth", "Mars",
//        "Jupiter", "Saturn", "Uranus", "Neptune"
//    )
//    solarSystem.add("Pluto")
//    solarSystem[3] = "Future Moon"
//    solarSystem.removeAt(9)
//    println(solarSystem.contains("Pluto"))
//    println(solarSystem.size)
//
//    for (planet in solarSystem){
//        println(planet)
//    }
    val solarSystem = mutableSetOf(
        "Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"
    )
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println("Pluto" in solarSystem)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
}
