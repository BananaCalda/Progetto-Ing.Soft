public class Contact {
    private Person generalita;
    private String numero;
    public Contact(Person p){
        generalita = p;
        numero = p.getNumTelefono();
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return generalita.getNome();
    }
    public String getCognome() {
        return generalita.getCognome();
    }
}
