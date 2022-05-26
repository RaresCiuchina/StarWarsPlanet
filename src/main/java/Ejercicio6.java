import java.util.Arrays;
import java.util.Objects;

public class Ejercicio6 {

    public Planets planets;

    public Ejercicio6() {
        planets = new Planets(ObtenerPlanetsRequest.Companion.get().getResults());
    }

    public Planet[] cuantosPlanetasHay() {

        int cont = 0;
        Planet[] array = planets.obtenerTodos();
        for (Planet planeta : array) {
            if (!planeta.getName().equals("")) {
                array[cont] = planeta;
                cont++;
            }
        }
        return getArraySinNulos(array, cont);
    }

    public Planet[] getArraySinNulos(Planet[] array, int nulos) {
        return Arrays.copyOfRange(array, 0, nulos);
    }


    // TODO Haz la función en la clase Ejercicio6:
    //  obtenerMasPobladosQue(int poblacion)
    //  nos devuelve una lista de aquellos planetas que tienen más población
    //  que el integer pasado por parámetro

    public Planet[] obtenerMasPobladosQue(int poblacion) {
        Planet[] fuera = new Planet[planets.obtenerTodos().length];
        int i = 0;

        for (Planet planeta : planets.obtenerTodos()) {
            if (planeta.getPopulation().equals("unknown")) {
                break;
            }
                int a = Integer.parseInt(planeta.getPopulation());
                if (a > poblacion) {
                    fuera[i] = planeta;
                    i++;
                }

            }

            return getArraySinNulos(fuera, i);
        }

    //TODO Haz la función en la clase Ejercicio6:
    // obtenerPlanetasConTerreno(String terreno)
    //  nos devuelve una lista de aquellos planetas
    //  que tienen terrenos que se llamen como el string.

    public Planet[] obtenerPlanetasConTerreno(String terreno){
        Planet[] fuera = new Planet[planets.obtenerTodos().length];
        int i = 0;

        for(Planet planeta : fuera){
            if (planeta.getTerrain().equals("unknown") || planeta.getTerrain().equals(null)) {
                break;
            }
            if (planeta.getTerrain().equals(terreno)){
                fuera[i]=planeta;
                i++;
            }
        }
        return getArraySinNulos(fuera,i);
    }



}
