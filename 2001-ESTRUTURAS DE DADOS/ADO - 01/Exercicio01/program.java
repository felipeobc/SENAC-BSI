package application;

import model.Compras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Compras compras;
        List<Compras> listCompras = new ArrayList<>();

        Compras lista[] = new Compras[4];
        int numPedido = 1;
        int result = 0;
        String resposta = "";
        boolean encerrar = false;

        System.out.print("Qual exercicio deseja executar?(1/2/3) \nRespota: ");
        result = sc.nextInt();


            System.out.print("Deseja cadastrar com Array ou List? \nResposta (1/2): ");
            result = sc.nextInt();
            sc.nextLine();

            if (result == 1) {
                System.out.println("Cadastres os produtos");

                for (int i = 0; i < lista.length; i++) {
                    compras = new Compras();

                    System.out.println("\nProduto #" + (i + 1));

                    compras.novoPeduto(numPedido);
                    lista[i] = compras;
                    numPedido++;
                }

                System.out.println("Veja o que foi cadastrado!");
                for (int i = 0; i < lista.length; i++) {
                    System.out.println(lista[i]);
                }
            } else {
                System.out.println("Cadastres os produtos");
                do {
                    compras = new Compras();

                    compras.novoPeduto(numPedido);
                    listCompras.add(compras);
                    numPedido++;

                    System.out.print("Deseja cadastrar mais?(y/n): ");
                    resposta = sc.nextLine();

                    if (resposta.equals("n")) {
                        encerrar = true;
                    } else{
                        encerrar = false;
                    }

                } while (encerrar != true);

                result = 0;
                System.out.println("\nCadastro finalizado!");
                System.out.println("Essa foi sua lista\n");

                for (Compras x: listCompras) {
                    System.out.println(x);
                }

            }
    }
}
