import java.util.*;
/**
 * Exercício 2

a	Leia uma matriz bidimensional quadrada de ordem 4, para armazenar números reais. Determine a soma dos elementos na diagonal principal.
b	Elabore um projeto contendo uma classe Compra, com os atributos: produto, código e valor. Elabore uma classe para definir um array de objetos, com quatro elementos. Leia e exiba os resultados, exiba também o total do valor das compras.

 */
public class Exercicio02 {

    public static void main(String[] args) {
        //a
        Scanner teclado = new Scanner(System.in);
        int [][] Matriz = new int[2][2];
        int soma=0;

        for(int i =0; i<Matriz.length; i++){
            for(int j=0; j<Matriz.length; j++){
                System.out.println("Digite o Numero na Posicao: " + i +"x"+j);
                Matriz [i][j] = teclado.nextInt();
                if(i==j){
                    soma += Matriz[i][j];
                }
            }
        }
    }
}