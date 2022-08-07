package bancoNacional;

public class Cliente {
    private int nroCliente;
    private String apellido;
    private String dni;
    private String cuit;
//agregando constructor
    public Cliente(int nroCliente, String apellido, String dni, String cuit) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
// agregando getters and setters
    public int getNroCliente() {
        return nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String toString(){
        return "\n\tNro de Cliente: "+this.nroCliente+"\n\tApellido: "+this.apellido+"\n\tDNI: "+this.dni+"\n\tCUIT:"+this.cuit;
    }
}
