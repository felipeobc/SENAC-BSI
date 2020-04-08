import java.util.Scanner;

public class Secretaria extends Pessoa {

    private String departamento;
    private String ramal;

    // public Secretaria(String nome, String cpf, String rua) {
    //     super(nome, cpf, rua);
    //     // TODO Auto-generated constructor stub
    // }

    //info
    
    public void Cadastrar(){
        super.Cadastrar();

        Scanner s = new Scanner(System.in);

        System.out.println("Qual é o Ramal:");
        ramal = s.nextLine();

        System.out.println("Departamento: ");
        departamento = s.nextLine();
    }

}