package com.ceste.dani;

public class CarnetCruzRoja
{
    String nombre;
    String localidad;
    String servicio;
    String provincia;
    String fecha;
    String apellidos;
    String dni;

    public CarnetCruzRoja(String dni)
    {
        this.dni=dni;
    }


    //getters

    public String getNombre()
    {
        return nombre;
    }
    public String getLocalidad()
    {
        return localidad;
    }
    public String getServicio()
    {
        return servicio;
    }
    public String getProvincia()
    {
        return provincia;
    }
    public String getFecha()
    {
        return fecha;
    }
    public String getApellidos()
    {
        return apellidos;
    }
    public String getDni()
    {
        return dni;
    }

    // Setters

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setLocalidad(String localidad)
    {
        this.localidad=localidad;
    }
    public void setServicio(String servicio)
    {
        this.servicio=servicio;
    }
    public void setProvincia(String provincia)
    {
        this.provincia=provincia;
    }
    public void setFecha(String fecha)
    {
        this.fecha=fecha;
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos=apellidos;
    }
    public void setDni(String dni)
    {
        this.dni=dni;
    }

    public String toString()
    {
        String pinta = dni + "\t" + nombre + "\t" + apellidos + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" +fecha;
        return pinta;
    }

}
