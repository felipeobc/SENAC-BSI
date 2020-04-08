
public class BancoDeDados {
    
    private static final int MAX_PESSOAS = 1000;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int contador = 0;
    
    
    public void addPessoa(Pessoa pessoa){
        if(contador < pessoas.length){
            pessoas[contador] = pessoa;
            contador++;
        }
    }
    //Além dos métodos de remoção e busca

}