package bancoNacional;

public class CajaDeAhorro extends Cuentas{
    private double tasaDeInteres;

// creacion del constructor
    public CajaDeAhorro(double saldo, Cliente cliente, double tasaDeInteres) {
        super(saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    //metodos
    @Override
    public void extraer(double monto){
        System.out.println("\nIntentando estraer: $"+ monto);
        if(monto<=getSaldo()){
            System.out.println("La operacion se realizo con exito");
            setSaldo(getSaldo()-monto); // en el set agrego  el saldo - el monto
        }else{
            System.out.println("Es saldo es insuficiente para la extraccion");
        }
    }

    public void cobrarInteres (){
        //coloco el 1+ la tasa de interes para que se sume el total no solo el porcentaje sacado.
        setSaldo((1+this.tasaDeInteres)*getSaldo());
        System.out.println("Cobrando interes: "+ this.tasaDeInteres*100+ "%");
    }

}
