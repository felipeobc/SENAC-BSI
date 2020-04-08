import java.util.Random;
import java.util.Scanner;

/**
 * Exercício 3

Elabore um projeto em Java que defina como estruturas de dados, um array de tamanho igual a 100 para armazenar valores reais de simples precisão (float). Defina métodos para:

a)	Inserir valores aleatórios no array. A faixa de valores dos números aleatórios deve estar entre 0 a 200.
b)	Ordenar o conjunto de dados por um método de sua escolha. Exceto método bolha (bubble sort).
c)	Pesquisar  um valor fornecido pelo usuário, via teclado (método busca binária na forma recursiva). O método deve retornar o índice onde o valor está armazenado ou -1 caso não encontre.
d)	Desafio: Proponha um método que remova um valor do array,

 */
public class Exercicio03 {

    public static void main(String[] args) {
        double array [] = new double[100];
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        double numeroChave;
        
        //numeros aleatorios
        for(int i=0; i<array.length; i++){
            array[i] = gerador.nextDouble() * 200;
        }

        
        //ordenar
        insertionSort(array);

        //Busca de numero chave
        System.out.println("Escolha um numero para procurar:");
        numeroChave = ler.nextDouble();
        busca(array, numeroChave);
        



    }


    public static void insertionSort(double[] array) {
        int j;
        double key;
        int i;

        for (j = 1; j < array.length; j++) {
            key = array[j];
            for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }
    }

    private static int busca(double[] array, double chave) {
        return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
	}

	private static int buscaBinariaRecursiva(double[] array, int menor, int maior, double chave) {
        int media = (maior + menor) / 2;
        double valorMeio = array[media];

        if (menor > maior)
            return -1;
        else if (valorMeio == chave)
            return media;
        else if (valorMeio < chave)
            return buscaBinariaRecursiva(array, media + 1, maior, chave);
        else
            return buscaBinariaRecursiva(array, menor, media - 1, chave);
	}
    
}