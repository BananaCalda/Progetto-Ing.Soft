public class Employee extends Person{
    private float stipendio;
    public Employee(String cf,String n,String c,String num,float stp){
        super(cf,n,c,num);
        stipendio = stp;
    }

    public float getStipendio() {
        return stipendio;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }
}
