import jdk.nashorn.internal.ir.ReturnNode;

/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private String cpf;
    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void cadastro(){
        // Apos ser chamado ele executa a função de cadastra o cliente

    }

    public String consultar(String nome, String cpf){
        int variavel=0;
        if(variavel == 0){
            return nome;
        }else{
            return cpf;
        }
        //chama a class devolve os valores do nome ou do CPF do cliente
    }
}