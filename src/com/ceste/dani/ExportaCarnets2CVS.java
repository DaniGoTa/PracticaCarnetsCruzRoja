package com.ceste.dani;

import java.io.FileWriter;
import java.io.IOException;

public class ExportaCarnets2CVS
{
    public ExportaCarnets2CVS(ArrayList carnets, String nombreFichero)
    {
        this.carnets = carnet;
        this.nombreFichero = nombreFichero;
    }
    public void guardaDatos()throws IOException
    {
        FileWriter escritor = new FileWriter(nombreFichero);
        BufferedWriter escritorConBuffer= new BufferedWriter(escritor);
        // falta
        carnets.get(0).toString();
        // rellenar con campos
        String carnetEnString = carnet1.getNombre() + "\t" + carnet1.getApellidos();
        escritorConBuffer.write(carnetEnString, 0, carnetEnString.length());
        escritorConBuffer.newLine();
    }
}
