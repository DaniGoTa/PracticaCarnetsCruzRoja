package com.ceste.dani;

import java.util.Comparator;

public class OrdenarCarnetsPorDNI implements Comparator<CarnetCruzRoja>
{
    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2)
    {
        return  o1.getDni().compareTo(o2.getDni()) > 0 ? 1 : o1.getDni().compareTo(o2.getDni()) < 0 ? -1 : 0;
    }
}
