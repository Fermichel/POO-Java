package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Date dia= new Date();
        Impresora impresora; //=new Impresora("Epson",dia, "USB");
        Impresora impresora1;
        impresora= new ImpresoraCanon("Canon",dia, "USB");
        impresora1= new ImpresoraEpson("Epson", dia, "USB");
        String texto = impresora.imprimir();
        System.out.println(texto);


        Impresora[] impresoras= new Impresora[2];
        impresoras[0] =impresora;
        impresoras[1]=impresora1;

        for (int i =0; i<impresoras.length;i++)
            System.out.println(impresoras[i].imprimir());

    }
}
