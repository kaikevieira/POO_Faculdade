package k_banco_kaike;

public class Conta {

    protected int agencia;
    protected int numero;
    protected String cliente;
    protected double saldo;

    

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + 
        ", numero=" + numero + 
        ", cliente=" + cliente + 
        ", saldo=" + saldo + "]";
    }

    public Conta(int agencia, int numero, String cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public boolean deposito(double vl){
        saldo += vl;
        return true;
    }

    public boolean saque(double vl){
        if(saldo >= vl){
            saldo -= vl;
            return true;
        }
        return false;
    }

    public boolean transferencia(Conta destino, double vl) {
		if(saque(vl)) {
			if(destino.deposito(vl)) {
				return true;
			}else {
				deposito(vl);
				return false;
			}
		}
		return false;
	}

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
