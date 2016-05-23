package com.ceste.dani;

import java.util.Comparator;

public class OrdenarCarnetsPorFecha implements Comparator<CarnetCruzRoja>
{
    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2)
    {
        return  o1.getFecha().compareTo(o2.getFecha()) > 0 ? 1 : o1.getFecha().compareTo(o2.getFecha()) < 0 ? -1 : 0;
    }
}
