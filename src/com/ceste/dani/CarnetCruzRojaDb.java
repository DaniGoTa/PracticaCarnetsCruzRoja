package com.ceste.dani;

import java.io.*;
import java.util.ArrayList;

class CarnetsCruzRojaDb
    {
    private ArrayList<CarnetCruzRoja> carnets; // Colección de carnets
    private String fichero; // nombre de fichero donde se guardan los carnets

    CarnetsCruzRojaDb(String fichero, ArrayList<CarnetCruzRoja> carnets) {
        this.fichero=fichero;
        this.carnets=carnets;
    }
    /**
     * Abre el fichero en modo lectura y carga sus datos en la variable carnets
     * Debes usar flujos de objetos (ObjectInputStream)
     */
    public void cargar()
    {
        try
        {
            //ArrayList<CarnetCruzRoja> d = carnets;
            FileInputStream f = new FileInputStream(fichero);
            ObjectInputStream s = new ObjectInputStream(f);
            carnets = (ArrayList<CarnetCruzRoja>) s.readObject();
            s.close();
            System.out.println(carnets);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * Abre el fichero en modo escritura y vuelca en el contenido del atributo carnets
     * Debes usar flujos de objetos (ObjectOutputStream)
     */
    public void guardar()
    {
        try
        {
            FileOutputStream f = new FileOutputStream(fichero);
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject (carnets);
            s.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
