

public class Foe extends Character {
    private Race race;
    private Weapon weapon;

    // Constructor
    public Foe(String name, int level, Race race, Weapon weapon) {
        super(name, level);
        this.race = race;
        this.weapon = weapon;
    }

    // Method untuk menyerang dengan senjata
    public void attackWithWeapon(Character opponent) {
        int AP = this.weapon.getAP();
        opponent.currentHP -= AP;
        System.out.println(this.name + " menyerang " + opponent.name + " dengan " + this.weapon.getName() + " dan " + AP + " AP!");
    }
}
