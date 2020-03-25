/**
 * Conta
 */
public class Conta {

    private int numero;
    private double saldo;
    private String cpf;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean construtor(int numero, String cpf){
        //Valida que a conta é verdadiera
        int variavel=0;
        if(variavel == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean saque(double valor) {
        //Executa a aoperação de saque
        return true;
    }

    public boolean deposito(double valor) {
        //Executa a aoperação de deposito
        return true;
    }
}