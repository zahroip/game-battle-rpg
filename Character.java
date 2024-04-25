

public class Character {
    protected String name;
    protected int level;
    protected int maxHP;
    protected int maxMP;
    protected int currentHP;
    protected int currentMP;

    // Constructor
    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.maxHP = level * 100; // Misalkan tiap level HP bertambah 100
        this.maxMP = level * 50;  // Misalkan tiap level MP bertambah 50
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
    }

    // Method untuk menyerang
    public void attack(Character opponent, int AP) {
        opponent.currentHP -= AP;
        System.out.println(this.name + " menyerang " + opponent.name + " dengan " + AP + " AP!");
    }

    // Method untuk menggunakan potion
    public void usePotion(int amount) {
        this.currentHP += amount;
        if (this.currentHP > this.maxHP) {
            this.currentHP = this.maxHP;
        }
        System.out.println(this.name + " menggunakan potion dan menambah " + amount + " HP.");
    }

    // Method untuk menggunakan ether
    public void useEther(int amount) {
        this.currentMP += amount;
        if (this.currentMP > this.maxMP) {
            this.currentMP = this.maxMP;
        }
        System.out.println(this.name + " menggunakan ether dan menambah " + amount + " MP.");
    }

    // Method untuk menampilkan status karakter
    public void displayStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.currentHP + "/" + this.maxHP);
        System.out.println("MP: " + this.currentMP + "/" + this.maxMP);
    }
}