package com.ceste.dani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    static Scanner in = new Scanner(System.in);
    static final String nombreFichero = "C:\\Users\\Dani\\Desktop\\entrada.csv";
    static final String fichero = "C:\\Users\\Dani\\Desktop\\entradaserializacion.ser";
    public static void main(String[] args)
    {

        System.out.println("Cuantos carnets quiere introducir?");
        int sizer = in.nextInt();

        // declaracion array normal
        CarnetCruzRoja carnet [] = new CarnetCruzRoja[sizer];
        carnet = addCarnet (carnet);

        //Declaracion arrayList
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();
        copyCarnetToArrayList(carnet, carnets);

        //ordenacion
        System.out.println("1 = ordenacion natural");
        System.out.println("2 = ordenar por DNI");
        System.out.println("3 = ordenar por fecha");
        int caso = in.nextInt();
        switch (caso) {
            case 1: Collections.sort(carnets);
                break;
            case 2: Collections.sort(carnets, new OrdenarCarnetsPorDNI());
                break;
            case 3: Collections.sort(carnets, new OrdenarCarnetsPorFecha());
                break;
            default: Collections.sort(carnets);
                break;
        }

        //pintar
        pintaCarnetFromArray(carnet);
        pintaCarnetFromArrayList(carnets);

        //exporta carnets
        ExportaCarnets2CVS exportador = new ExportaCarnets2CVS(carnets, nombreFichero);
        exportador.guardaDatos();

        //serializacion
        CarnetsCruzRojaDb serializador = new CarnetsCruzRojaDb(fichero, carnets);
        serializador.guardar();
        serializador.cargar();

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
        System.out.println("Se escribira el array normal");
        for (int i=0;i<carnet.length;++i)
        {
            System.out.println(carnet[i].toString());
        }
    }

    public static void pintaCarnetFromArrayList(ArrayList<CarnetCruzRoja> carnets)
    {
        System.out.println("Se escribira el arrayList");
        for (int i=0;i<carnets.size();++i)
        {
            System.out.println(carnets.get(i));

        }
    }
}
