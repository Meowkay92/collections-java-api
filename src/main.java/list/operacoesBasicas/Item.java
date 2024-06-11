package main.java.list.operacoesBasicas;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quantidade +
                '}';
    }
}