public class ContaEstudante extends Conta{
    public void rende() throws ValorInvalidoException{
        this.deposita( ( this.getSaldo() * 1.1 ) - this.getSaldo() );
    }
}
