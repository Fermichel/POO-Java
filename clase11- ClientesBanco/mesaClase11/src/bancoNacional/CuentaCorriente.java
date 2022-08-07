package bancoNacional;

public class CuentaCorriente extends Cuentas{
    private double montoDescubierto;
//crear constructor

    public CuentaCorriente(double saldo, Cliente cliente, double montoDescubierto) {
        super(saldo, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void extraer(double monto){
        System.out.println("\nIntentando estraer: $"+ monto);
        if(monto<=getSaldo()){
            System.out.println("La operacion se realizó con exito");
            setSaldo(getSaldo()-monto);
        } else if (monto<=(this.montoDescubierto+ getSaldo())){
            System.out.println("La operacion se realizó con exito");
            setSaldo(getSaldo()-monto);
            this.montoDescubierto = this.montoDescubierto+getSaldo()-monto;
        } else{
            System.out.println("El monto descubierto lo superó");
        }
    }

}
