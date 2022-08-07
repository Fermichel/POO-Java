package bancoNacional;

public class CuentaComiente extends Cuentas{
    private String cnv;

    public CuentaComiente(double saldo, Cliente cliente, String cnv) {
        super(saldo, cliente);
        this.cnv = cnv;
    }
//sobrescritura
    @Override
    public void depositar(double monto){
        super.depositar(monto*0.99);
    }
// me falta calcular el 50%
    @Override
    public void extraer(double monto){
        System.out.println("Intentando extraer: $" + monto);
        double aux = (monto*0.5);
        if (monto <= (getSaldo() - aux)){
            setSaldo(getSaldo() - aux);
        }
    }

    //sobrecarga
    public void extraer(double monto, String cnv){
        System.out.println("Intentando extraer: $" + monto);
        if (this.cnv.equals(cnv)&& monto <= getSaldo()){
            setSaldo(getSaldo()-monto);
        }
    }

}
