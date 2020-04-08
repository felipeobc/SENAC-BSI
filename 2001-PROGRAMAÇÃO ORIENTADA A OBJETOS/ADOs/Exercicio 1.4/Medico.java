import java.util.Scanner;

public class Medico extends Pessoa {

    private int crm;
    private String especializacao;
    private Paciente[] pacientes;

    // public Medico(String nome, String cpf, String rua) {
    //     super(nome, cpf, rua); //Super: class Mãe.
    //     // TODO Auto-generated constructor stu    

    // }
    public void Cadastrar(){
        super.Cadastrar();
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é o CRM:");
        crm = s.nextInt();

        System.out.println("Especialização: ");
        especializacao = s.nextLine();
    }
    
    public void info() {
        super.info();
        System.out.println("Dados Adicionais do Medico");
        System.out.println("CRM: "+ crm);
        System.out.println("Especialização: "+especializacao);
        

    }
    
}