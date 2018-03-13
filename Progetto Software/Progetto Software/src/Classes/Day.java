package Classes;

public enum Day{
    MONDAY("MON"),TUESDAY("TUE"),WEDNESDAY("WED"),THURSDAY("THU"),FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
    private String abbreviation;
    private Day(String a){
        abbreviation = a;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
}
