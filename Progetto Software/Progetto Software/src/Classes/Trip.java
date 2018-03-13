package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Trip {
    private int id;
    private Date dataInizio;
    private Date dataFine;
    private String location;
    private ArrayList<Bus> autobus = new ArrayList<Bus>();
    private ArrayList<Child> children = new ArrayList<Child>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Parent> parents = new ArrayList<Parent>();
    private boolean valid = false;

    public Trip(Date di,Date df, String l,int i) {
        id = i;
        dataInizio=di;
        dataFine = df;
        location=l;
    }
    public void addBus(Bus b){
        autobus.add(b);
    }

    public void removeBus(Bus b){


    }

    public void addChild(Child a){
        children.add(a);
        if(!employees.isEmpty())
            valid = true;
    }

    public void removeChild(Child a){
        if(children.isEmpty()) {
            System.out.println("lista vuota, bambino non rimosso dalla lista");
            return;
        }
        int j = 0;
        for(Child x: children){
              if(x.equals(a)){
                  children.remove(j);
                  System.out.println("Bambino rimosso con successo dalla lista");
                  break;
              }
              j++;
          }
    }

    public void addEmployee(Employee a){
        employees.add(a);
        if(!children.isEmpty())
            valid = true;
    }

    public void removeEmployee(Employee a){
        if(employees.isEmpty()) {
            System.out.println("lista vuota, impiegato non rimosso dalla lista");
            return;
        }
        int j = 0;
        for(Employee x: employees){
            if(x.equals(a)){
                employees.remove(j);
                System.out.println("Genitore rimosso con successo dalla lista");
                break;
            }
            j++;
        }
    }

    public void addParent(Parent a){
        parents.add(a);
    }

    public void removeParent(Parent a){
        if(parents.isEmpty()) {
            System.out.println("lista vuota, genitore non rimosso dalla lista");
            return;
        }
        int j = 0;
        for(Parent x: parents){
            if(x.equals(a)){
                parents.remove(j);
                System.out.println("Genitore rimosso con successo dalla lista");
                break;
            }
            j++;
        }
    }


    public int getId() {
        return id;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public String getLocation() {
        return location;
    }

}