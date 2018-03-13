import java.util.ArrayList;

public class Person {
    private String codFiscale;
    private String nome;
    private String cognome;
    private String numTelefono = "";
    public Person(String cf,String n,String c,String num){
        codFiscale = cf;
        cognome = c;
        nome = n;
        try{
            int test = 0;
            test = Integer.parseInt(num);
        }
            catch(NumberFormatException e){
                System.out.println("Il numero inserito non è valido!");
            }
        try{
            if(num.length()!=10)
                throw new IllegalArgumentException();
            else
                numTelefono = num;
        }catch (IllegalArgumentException e){
            System.out.println("Il numero inserito non è valido!");
        }

    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public String getNumTelefono() { return numTelefono; }
}