import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio6 ej = new Ejercicio6();

    @Test
    public void test1(){
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Todos los planetas.
        // tip: ej.planets.obtenerTodos()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 10
        Assertions.assertEquals(10,
                ej.cuantosPlanetasHay().length);
    }


        // TODO Haz la función en la clase Ejercicio6:
        //  obtenerMasPobladosQue(int poblacion)
        //  nos devuelve una lista de aquellos planetas que
        //  tienen más población que el integer pasado por parámetro
        // TODO Haz todos los test que sean necesarios.
        // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
    @Test
    public void PruebaMasPobladoQue0() {
        Assertions.assertEquals( 3,ej.obtenerMasPobladosQue(0).length);
    }
    @Test
    public void PruebaMasPobladoQuemenos1() {
        Assertions.assertEquals( 3,ej.obtenerMasPobladosQue(-1).length);
    }
    @Test
    public void PruebaMasPobladoQue1000() {
        Assertions.assertEquals( 2,ej.obtenerMasPobladosQue(1000).length);
    }
    @Test
    public void PruebaMasPobladoQue100000() {
        Assertions.assertEquals( 2,ej.obtenerMasPobladosQue(100000).length);
    }
    @Test
    public void PruebaMasPobladoQue1000000() {
        Assertions.assertEquals( 1,ej.obtenerMasPobladosQue(1000000).length);
    }

    @Test
    public void PruebaMasPobladoQue10000000() {
        Assertions.assertEquals( 1,ej.obtenerMasPobladosQue(10000000).length);
    }



    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasConTerreno(String terreno)
    //  nos devuelve una lista de aquellos planetas que tienen terrenos que se llamen como el string.
    // tip: Algunos terrenos disponibles: forests, mountains, hills, etc.
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene un terreno indeterminada, no debe mostrarse

    @Test
    public void PruebaObtenerPlanetasConTerrenoForests() {
        Assertions.assertEquals(3, ej.obtenerPlanetasConTerreno("forests").length);
    }
    @Test
    public void PruebaObtenerPlanetasConTerrenoArid() {
        Assertions.assertEquals(0, ej.obtenerPlanetasConTerreno("arids").length);
    }
    @Test
    public void PruebaObtenerPlanetasConTerrenoMountains() {
        Assertions.assertEquals(4, ej.obtenerPlanetasConTerreno("mountains").length);
    }
    @Test
    public void PruebaObtenerPlanetasConTerrenohills() {
        Assertions.assertEquals(1, ej.obtenerPlanetasConTerreno("hills").length);
    }
    @Test
    public void PruebaObtenerPlanetasConTerrenoPlain() {
        Assertions.assertEquals(0, ej.obtenerPlanetasConTerreno("plain").length);
    }
    @Test
    public void PruebaObtenerPlanetasConTerrenoDesert() {
        Assertions.assertEquals(1, ej.obtenerPlanetasConTerreno("desert").length);
    }

    @Test
    public void PruebaObtenerPlanetasConTerrenoRainforests() {
        Assertions.assertEquals(1, ej.obtenerPlanetasConTerreno("rainforests").length);
    }


    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasResidentes(int residentes, String nombre)
    //  nos devuelve una lista de aquellos planetas que tienen más residentes que la variable "residentes" y que su nombre contenga el String "nombre"
    // tip: cada residente es represetnado por una url, solo tienes que contar.
    // Ej si residents=[https://swapi.dev/api/people/3/, https://swapi.dev/api/people/21/] el resultado será 2
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse

    //Tatooine tiene 10 residentes

    @Test
    public void PruebaobtenerPlanetasResidentes0tatoo(){
        Assertions.assertEquals(1,ej.obtenerPlanetasResidentes(0,"Tatooine").length);
    }
    @Test
    public void PruebaobtenerPlanetasResidentes9tatoo(){
        Assertions.assertEquals(1,ej.obtenerPlanetasResidentes(9,"Tatooine").length);
    }
    @Test
    public void PruebaobtenerPlanetasResidentes10tatoo(){
        Assertions.assertEquals(0,ej.obtenerPlanetasResidentes(10,"Tatooine").length);
    }


}
