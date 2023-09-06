package entidades;
import java.util.Random;
public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        Random r = new Random();
        this.id = r.nextInt(9000)+1000;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
