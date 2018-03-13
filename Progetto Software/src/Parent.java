import javax.lang.model.type.NullType;
import java.util.ArrayList;

public class Parent extends Person {
    private ArrayList<Child> figli;
    private Parent coniuge;
    public Parent(String cf,String n,String c,String num){
        super(cf,n,c,num);
        figli = new ArrayList<Child>();
    }
    public void addChild(String cf,String n,String c, int cod,Pediatrician pd){
        Child a = new Child(cf,n,c,cod,this,coniuge,pd);
        figli.add(a);
    }
    public void removeChild(int cod){
        int i = 0;
        for(Child x: figli){
            if(x.getCodice() == cod)
                figli.remove(i);
            i++;
        }
    }
    public void addConiuge(String cf,String n,String c,String num){
        if(coniuge == null) {
            Parent cog = new Parent(cf, n, c, num);
            coniuge = cog;
            for(Child x: figli){
                x.addParent2(coniuge);
            }
        }else
            System.out.println("Coniuge già presente.");
    }
}