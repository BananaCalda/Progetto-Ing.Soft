package Classes;

import java.util.ArrayList;

public class Menu {
    private Day d;
    private int id;
    private boolean valid = false;
    private ArrayList<Dish> dishes = new ArrayList<Dish>();
    public Menu(int i,Day a){
        d = a;
        id = i;
    }
    public void addDish(Dish dish){
        if(dishes.isEmpty())
            valid = true;
        dishes.add(dish);
    }
    public void removeDish(Dish i){
        if(dishes.isEmpty()){
            System.out.println("Menù vuoto, impossibile rimuovere il piatto");
            return;
        }
        int j = 0;
        boolean found = false;
        for(Dish x: dishes){
            if(x.equals(i)) {
                dishes.remove(j);
                found = true;
            }
            j++;
        }
        if(found == false)
            System.out.println("non è stato trovato l'ingrediente da rimuovere nel piatto!");
        if(dishes.isEmpty())
            valid = false;
    }
}