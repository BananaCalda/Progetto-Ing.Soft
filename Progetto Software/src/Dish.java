import java.util.ArrayList;

public class Dish {
    private String nome;
    private ArrayList<Ingredient> ingredienti = new ArrayList<Ingredient>();
    private boolean valid = false;
    private ArrayList<Child> bambiniAllergici = new ArrayList<>();
    public Dish(String n){
        nome =  n;
    }
    public void addIngredient(Ingredient i){
        ingredienti.add(i); //andrebbe implementato qua un confronto allergie bambini con ingredienti piatto
        if(i.getSupplier().getValidity() == false)
            valid = false;
    }
    public void removeIngredient(Ingredient i){
        if(ingredienti.isEmpty()){
                System.out.println("Piatto vuoto, impossibile rimuovere altri ingredienti");
                return;
        }
        int j = 0;
        boolean found = false;
        for(Ingredient x: ingredienti){
            if(x.equals(i)) {
                ingredienti.remove(j);
                found = true;
            }
            j++;
        }
        if(found == false)
            System.out.println("non è stato trovato l'ingrediente da rimuovere nel piatto!");
        if(ingredienti.isEmpty())
            valid = false;
    }

    public void setIngredientValidity(){
        boolean temp = true;
        for(Ingredient x: ingredienti) {
            temp = x.getSupplier().getValidity();
            if(temp == false)
                break;
        }
        valid = temp;
    }
}
