public class Supplier {
    private String nomeAzienda;
    private int codice;
    private boolean valid = true;
    public Supplier(String n,int c){
        nomeAzienda = n;
        codice = c;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    public boolean getValidity(){
        return valid;
    }
}