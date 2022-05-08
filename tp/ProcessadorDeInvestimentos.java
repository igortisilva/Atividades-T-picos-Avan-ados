import java.util.ArrayList;

public class ProcessadorDeInvestimentos {
    public static void main(String[] args) throws ValorInvalidoException {
        for(ContaEstudante c: contasComRendimento()){
            c.rende();
            System.out.println("Novo Saldo");
            System.out.println(c.getSaldo());
        }
    }
    public static ArrayList<ContaEstudante> contasComRendimento() throws ValorInvalidoException{
        ArrayList<ContaEstudante> contas = new ArrayList<>();
        ContaEstudante c = new ContaEstudante();
        c.deposita(100);
        ContaEstudante c2 = new ContaEstudante();
        c2.deposita(200);
        ContaEstudante c3 = new ContaEstudante();
        c3.deposita(370);
        ContaEstudante c4 = new ContaEstudante();
        c4.deposita(550);
        contas.add(c);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        return contas;
    }
}
