import com.google.gson.Gson

var gson = Gson()

fun main() {
    val ej5 = Ejercicio6()
    ObtenerPlanetsRequest.get()
    ej5.planets.obtenerTodos().forEach { println(it) }

}
