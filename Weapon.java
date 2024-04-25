

public class Weapon {
    private String name;
    private int AP;

    // Constructor
    public Weapon(String name, int AP) {
        this.name = name;
        this.AP = AP;
    }

    // Getter untuk nama senjata
    public String getName() {
        return this.name;
    }

    // Getter untuk attack point senjata
    public int getAP() {
        return this.AP;
    }
}