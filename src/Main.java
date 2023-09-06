import entidades.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Treloso", 3.5);
        p1.setPreco(0.5);
        System.out.println(p1.getPreco());
        Produto p2 = new Produto(4567, "Banana", 7.0);
        p2.setPreco(10);
        
    }
}