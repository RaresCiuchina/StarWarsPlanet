data class PlanetResponse (
    val count: Long,
    val next: String,
    val previous: Any? = null,
    val results: Array<Planet>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PlanetResponse

        if (count != other.count) return false
        if (next != other.next) return false
        if (previous != other.previous) return false
        if (!results.contentEquals(other.results)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = count.hashCode()
        result = 31 * result + next.hashCode()
        result = 31 * result + (previous?.hashCode() ?: 0)
        result = 31 * result + results.contentHashCode()
        return result
    }
}

data class Planet (
    val name: String,
    val rotationPeriod: String,
    val orbitalPeriod: String,
    val diameter: String,
    val climate: String,
    val gravity: String,
    val terrain: String,
    val surfaceWater: String,
    val population: String,
    val residents: Array<String>,
    val films: Array<String>,
    val created: String,
    val edited: String,
    val url: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Planet

        if (name != other.name) return false
        if (rotationPeriod != other.rotationPeriod) return false
        if (orbitalPeriod != other.orbitalPeriod) return false
        if (diameter != other.diameter) return false
        if (climate != other.climate) return false
        if (gravity != other.gravity) return false
        if (terrain != other.terrain) return false
        if (surfaceWater != other.surfaceWater) return false
        if (population != other.population) return false
        if (!residents.contentEquals(other.residents)) return false
        if (!films.contentEquals(other.films)) return false
        if (created != other.created) return false
        if (edited != other.edited) return false
        if (url != other.url) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + rotationPeriod.hashCode()
        result = 31 * result + orbitalPeriod.hashCode()
        result = 31 * result + diameter.hashCode()
        result = 31 * result + climate.hashCode()
        result = 31 * result + gravity.hashCode()
        result = 31 * result + terrain.hashCode()
        result = 31 * result + surfaceWater.hashCode()
        result = 31 * result + population.hashCode()
        result = 31 * result + residents.contentHashCode()
        result = 31 * result + films.contentHashCode()
        result = 31 * result + created.hashCode()
        result = 31 * result + edited.hashCode()
        result = 31 * result + url.hashCode()
        return result
    }
}