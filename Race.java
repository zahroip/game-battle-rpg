

public class Race {
    private String name;
    private Weapon preferredWeapon; // Menyimpan senjata yang disukai oleh ras

    // Constructor
    public Race(String name, Weapon preferredWeapon) {
        this.name = name;
        this.preferredWeapon = preferredWeapon;
    }

    // Getter untuk nama ras
    public String getName() {
        return this.name;
    }

    // Getter untuk senjata yang disukai oleh ras
    public Weapon getPreferredWeapon() {
        return this.preferredWeapon;
    }
}
