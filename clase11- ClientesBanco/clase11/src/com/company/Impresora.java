package com.company;

import java.util.Date;

public abstract class Impresora {

    private String modelo;
    private Date fechaFabricacion;
    private String tipoConexion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public Impresora(String modelo, Date fechaFabricacion, String tipoConexion)
    {
        this.modelo=modelo;
        this.fechaFabricacion=fechaFabricacion;
        this.tipoConexion=tipoConexion;
    }
    public boolean tienePapel()
    {
        return hojasDisponibles>=1;
    }
    public boolean necesitaTinta()
    {
        return porcentajeTinta<1.0;
    }
    public abstract String imprimir();

}
