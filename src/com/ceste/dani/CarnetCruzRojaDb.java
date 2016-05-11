package com.ceste.dani;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarnetsCruzRojaDb
    {
    private ArrayList<CarnetCruzRoja> carnets; // Colección de carnets
    private String fichero ; // nombre de fichero donde se guardan los carnets
    CarnetsCurzRojaDb(String fichero) {
        // Completa
    }
    /**
     * Abre el fichero en modo lectura y carga sus datos en la variable carnets
     * Debes usar flujos de objetos (ObjectInputStream)
     */
    public void cargar()
    {
        // Completa
    }
    /**
     * Abre el fichero en modo escritura y vuelca en el contenido del atributo carnets
     * Debes usar flujos de objetos (ObjectOutputStream)
     */
    public void guardar()
    {
        // Completa
    }
}
