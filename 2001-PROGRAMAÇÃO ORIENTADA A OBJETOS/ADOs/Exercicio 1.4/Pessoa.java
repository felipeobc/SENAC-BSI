import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    // public Pessoa(String nome, String cpf, String rua) {
    //     this.nome = nome;
    //     this.cpf = cpf;
    //     this.endereco = new Endereco(rua);
    // }
    // Além dos getters e setters
    


    public void info() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco().getRua());
        
    }

    public void Cadastrar(){
        Scanner s = new Scanner(System.in);

        System.out.println("Nome da Pessoa:");
        nome = s.nextLine();
        System.out.println("CPF: ");
        cpf = s.nextLine();

        Endereco e = new Endereco();
        System.out.println("Qual é a rua: ");
        String rua = s.nextLine();
        e.setRua(rua);
        
        System.out.println("Qual é a cidade: ");
        String cidade = s.nextLine();
        e.setCidade(cidade);

        System.out.println("Qual é a cep: ");
        String cep = s.nextLine();
        e.setCep(cep);

        this.endereco = e;
        

    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}