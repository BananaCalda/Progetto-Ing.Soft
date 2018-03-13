package Classes;

public class Ingredient {
    private String nome;
    private Supplier supplier;
    public Ingredient(String n, Supplier s){
        nome = n;
        supplier = s;
    }

    public String getNome() {
        return nome;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
