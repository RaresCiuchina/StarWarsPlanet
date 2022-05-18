class Planets(private val planets: Array<Planet>) {

    fun obtenerTodos() : Array<Planet> {
        return planets
    }

    fun obtenerPotters() : Array<Planet> {
        return planets.filter {
            it.name.contains("Potter")
        }.toTypedArray()
    }
}

