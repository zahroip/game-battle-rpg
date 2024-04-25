

public class Hero extends Character {
    private Race race;
    private Weapon weapon;
    private int armorDefense;

    // Constructor
    public Hero(String name, int level, Race race, Weapon weapon, int armorDefense) {
        super(name, level);
        this.race = race;
        this.weapon = weapon;
        this.armorDefense = armorDefense;
    }

    // Method untuk menyerang dengan senjata
    public void attackWithWeapon(Character opponent) {
        int AP = this.weapon.getAP();
        opponent.currentHP -= AP;
        System.out.println(this.name + " menyerang " + opponent.name + " dengan " + this.weapon.getName() + " dan " + AP + " AP!");
    }

    public String getName(){
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }
    
    public Race getRace(){
        return race;
    }
}