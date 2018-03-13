package Classes;

import java.util.ArrayList;

public class Child{
    private int codice;
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private Pediatrician pediatra;
    private Parent[] genitori = new Parent[2];
    private ArrayList<Contact> contatti = new ArrayList<Contact>();
    private ArrayList<String> allergie = new ArrayList<String>();
    private ArrayList<String> intolleranze  = new ArrayList<String>();
    public Child(String cf,String n, String c,int cod,Parent parent1,Parent parent2,Pediatrician pd){
        nome = n;
        cognome = c;
        codice = cod;
        codiceFiscale = cf;
        genitori[0] = parent1;
        genitori[1] = parent2;
        Contact temp1 = new Contact(parent1);
        contatti.add(temp1);
        temp1 = new Contact(parent2);
        contatti.add(temp1);
        pediatra = pd;
    }
    public void addAllergia(String nome){
        allergie.add(nome);
    }
    public void addIntolleranza(String nome){
        intolleranze.add(nome);
    }
    public void addParent2(Parent c){
        if(genitori[1] == null)
            genitori[1] = c;
        else
            System.out.println("Il bambino ha già due genitori");

    }
    public int getCodice() {
        return codice;
    }
    public void addContatto(Contact c){
        contatti.add(c);
    }
    public void visualizzaContatti(){

    }

}