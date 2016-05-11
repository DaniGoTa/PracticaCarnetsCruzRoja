package com.ceste.dani;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportaCarnets2CVS
{
    String nombreFichero;
    ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();

    public ExportaCarnets2CVS(ArrayList<CarnetCruzRoja> carnets, String nombreFichero)
    {
        this.carnets = carnets;
        this.nombreFichero = nombreFichero;
    }
    public void guardaDatos()
    {
        try
        {
            FileWriter escritor = new FileWriter(nombreFichero);
            BufferedWriter escritorConBuffer = new BufferedWriter(escritor);
            try
            {
                for (int i = 0; i < carnets.size(); ++i)
                {
                    String carnetEnString = carnets.get(i).toString();
                    escritorConBuffer.write(carnetEnString, 0, carnetEnString.length());
                    escritorConBuffer.newLine();
                }
            }finally
            {
                escritorConBuffer.flush();
                escritorConBuffer.close();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
