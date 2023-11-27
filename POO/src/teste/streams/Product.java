package teste.streams;

import java.io.Serializable;

public class Product implements Serializable {
    private String price;
    private String nome;
    private Integer quantity;


    public Product(){

    }

    public Product(String price, String nome) {
        this.price = price;
        this.nome = nome;
    }

    public Product(String price, String nome, Integer quantity) {
        this.price = price;
        this.nome = nome;
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "produtos{" +
                "tamanho e prço: " + price + '\'' +
                "nome associado: " + nome + '\'' +
                '}';
    }
}
