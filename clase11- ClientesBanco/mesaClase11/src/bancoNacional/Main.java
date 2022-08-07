package bancoNacional;

public class Main {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(130,"Amer","1756987","2417569875");
        CajaDeAhorro cajaAhorro = new CajaDeAhorro(10000,cliente01,0.15);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(15000,cliente01,15000);
        CuentaComiente cuentaComiente = new CuentaComiente(20000,cliente01,"hola");

        acceder(cliente01);
        acceder(cajaAhorro);
        acceder(cuentaCorriente);
        acceder(cuentaComiente);



    }
     public static void acceder(Cliente cliente){
         System.out.println("\n------------------------------------------------------------");
         System.out.println("----------------------CLIENTE--------------------------------");
         System.out.println(cliente.toString());
         System.out.println("\n------------------------------------------------------------");
     }

     public static void acceder(CajaDeAhorro caja){
         System.out.println("\n------------------------------------------------------------");
         System.out.println("----------------------CAJA DE AHORRO-------------------------");
         System.out.println("\n------------------------------------------------------------");
         caja.informarSaldo();
         caja.cobrarInteres();
         caja.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         caja.extraer(5000);
         caja.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         caja.extraer(7000);
         caja.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         caja.depositar(3000);
         caja.informarSaldo();
     }

     public static void acceder(CuentaCorriente cuenta){
         System.out.println("\n------------------------------------------------------------");
         System.out.println("----------------------CUENTA CORRIENTE-------------------------");
         System.out.println("\n------------------------------------------------------------");
         cuenta.informarSaldo();
         cuenta.extraer(15000);
         cuenta.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         cuenta.depositar(3000);
         cuenta.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         cuenta.extraer(8000);
         cuenta.informarSaldo();
     }

     public static void acceder (CuentaComiente cuentaCom){
         System.out.println("\n------------------------------------------------------------");
         System.out.println("----------------------CUENTA COMIENTE-------------------------");
         System.out.println("\n------------------------------------------------------------");
         cuentaCom.informarSaldo();
         cuentaCom.depositar(11000);
         cuentaCom.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         cuentaCom.informarSaldo();
         cuentaCom.extraer(20000);
         cuentaCom.informarSaldo();
         System.out.println("\n------------------------------------------------------------");
         cuentaCom.informarSaldo();
         cuentaCom.extraer(10000,"hola");
         cuentaCom.informarSaldo();


     }
}