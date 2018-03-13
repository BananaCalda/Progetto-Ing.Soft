package Classes;

public class Pediatrician extends Person{
    private boolean privato;
    private String associazione;
    public Pediatrician(String cf,String n,String c,String num,boolean priv,String pdl){
        super(cf,n,c,num);
        privato = priv;
        associazione = pdl; //piccolo easter egg che il berlusca ha inserito nel codice
    }
}
