package bancoNacional;

public abstract class Cuentas {
    private double saldo;
    private Cliente cliente;
// genero el constructor
    public Cuentas(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }
// genero los getters and setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//metodos
    public void depositar(double monto){
        this.saldo = this.saldo+monto;
        System.out.println("Depositando: $" + monto + " al numero de cliente: " + this.cliente.getNroCliente());
    }
    // String.format("%.2f",this.saldo) hace que el formato de double aparezca con dos digitos despues del punto ej 100.00
    public void informarSaldo(){
        System.out.println("El saldo del cliente numero: "+ this.cliente.getNroCliente()+" es de: $"+String.format("%.2f",this.saldo));
    }

    public abstract void extraer (double monto);

}
