package Classes;

import java.util.ArrayList;

public class Canteen {
    private int id;
    private ArrayList<Menu> menues = new ArrayList<Menu>();
    private ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Child> children = new ArrayList<Child>();
    private boolean valid = false;
    public Canteen(int i){

        valid =  false;
    }
}
...