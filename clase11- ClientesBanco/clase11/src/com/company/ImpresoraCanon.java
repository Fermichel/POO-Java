package com.company;

import java.util.Date;

public class ImpresoraCanon extends  Impresora{

    public ImpresoraCanon(String modelo, Date fechaFabricacion, String tipoConexion)
    {
        super(modelo, fechaFabricacion, tipoConexion);
    }
    @Override
    public String imprimir() {
        return "Estoy imprimiento en una impresora Canon";
    }
    @Override
    public boolean necesitaTinta()
    {
        return super.necesitaTinta();
    }
}
