public class Conta {
    private double saldo;

    public Conta(){
        this.saldo = 0;
    }
    public void deposita(double valor) throws ValorInvalidoException{
        if(valor <= 0)
            throw new ValorInvalidoException();
        this.saldo+= valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
