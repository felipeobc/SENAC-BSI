/**
 * GerecadorClinicaMedica
 */
public class GerecadorClinicaMedica {

    public static void main(String[] args) {
        // Pessoa p = new Medico("Iara", "123", "Ruas dos pinheiros 256");
        // Pessoa p2 = new Paciente("Jose Ananias", "456", "EStrada de Itapecerica 3250");
        
        // System.out.println("Informação do Paciente");
        // p2.info();

        // System.out.println("Informação do medico");
        // p.info();

      Pessoa p = new Medico();
      p.Cadastrar();
      p.info();
    }
}