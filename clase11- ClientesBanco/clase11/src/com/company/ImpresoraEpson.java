package com.company;
import java.util.Date;
public class ImpresoraEpson extends  Impresora{

    public ImpresoraEpson(String modelo, Date fechaFabricacion, String tipoConexion)
    {
        super(modelo, fechaFabricacion, tipoConexion);
    }
    @Override
    public String imprimir() {
         return "Se esta imprimiendo en una impresora Epson";
    }
}
