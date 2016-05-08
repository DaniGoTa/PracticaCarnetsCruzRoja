package com.ceste.dani;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
     static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Cuantos carnets quiere introducir?");
        int size = in.nextInt();

        CarnetCruzRoja carnet [] = new CarnetCruzRoja[size];
        carnet = addCarnet (carnet);
        pintaCarnetFromArray(carnet);
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
