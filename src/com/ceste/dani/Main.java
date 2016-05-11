package com.ceste.dani;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner in = new Scanner(System.in);
    static String nombreFichero = "C:\\Users\\Dani\\Desktop\\entrada.csv";
    static String fichero = "C:\\Users\\Dani\\Desktop\\entradaserializacion.ser";
    public static void main(String[] args)
    {

        System.out.println("Cuantos carnets quiere introducir?");
        int size = in.nextInt();

        // declaracion array normal
        CarnetCruzRoja carnet [] = new CarnetCruzRoja[size];
        carnet = addCarnet (carnet);
        pintaCarnetFromArray(carnet);

        //Declaracion arrayList
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();
        copyCarnetToArrayList(carnet, carnets);

        new ExportaCarnets2CVS(carnets, nombreFichero);

        //serializacion
        new CarnetsCruzRojaDb(fichero);
    }

    private static void copyCarnetToArrayList(CarnetCruzRoja[] carnet, ArrayList<CarnetCruzRoja> carnets)
    {
        for (int i=0; i<carnet.length; ++i)
        {
            carnets.add(carnet[i]);
        }
    }

    public static CarnetCruzRoja[] addCarnet(CarnetCruzRoja carnet[])
    {
        for (int i=0; i< carnet.length;++i)
        {
            in.nextLine();
            System.out.println("introduce DNI");
            carnet[i] = new CarnetCruzRoja(in.nextLine());
            System.out.println("introduce nombre");
            carnet[i].setNombre(in.nextLine());
            System.out.println("introduce apellidos");
            carnet[i].setApellidos(in.nextLine());
            System.out.println("introduce provincia");
            carnet[i].setProvincia(in.nextLine());
            System.out.println("introduce localidad");
            carnet[i].setLocalidad(in.nextLine());
            System.out.println("introduce servicio");
            carnet[i].setServicio(in.nextLine());
            System.out.println("introduce fecha");
            carnet[i].setFecha(in.nextLine());
        }
        return carnet;
    }

    public static void pintaCarnetFromArray(CarnetCruzRoja carnet[])
    {
        for (int i=0;i<carnet.length;++i)
        {
            System.out.println(carnet[i].toString());
        }
    }

}
