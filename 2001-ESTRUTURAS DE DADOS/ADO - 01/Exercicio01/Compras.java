package model;

import java.util.Scanner;

public class Compras {

    private String produto;
    private String categoria;
    private Float preco;
    private Integer numPedido;

    public Compras(){ }

    public Compras(String produto, String categoria, Float preco, Integer numPedido) {
        this.produto = produto;
        this.categoria = categoria;
        this.preco = preco;
        this.numPedido = numPedido;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Integer numPedido) {
        this.numPedido = numPedido;
    }

    public void novoPeduto(Integer numPedido){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nonme do produto: ");
        this.setProduto(sc.nextLine());
        System.out.print("Catogoria do produto: ");
        this.setCategoria(sc.nextLine());
        System.out.print("Preço do produto: ");
        this.setPreco(sc.nextFloat());
        this.setNumPedido(numPedido);
    }

    @Override
    public String toString() {
        return "Compras{" +
                "produto='" + produto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                ", numPedido=" + numPedido +
                '}';
    }
}
