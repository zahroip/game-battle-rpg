public class Weapon {
    private String name;
    private int AP;

    Weapon(String name, int AP){
        this.name=name;
        this.AP=AP;
    }

    public String getName(){
        return name;
    }

    public int getAP(){
        return AP;
    }
    
}
