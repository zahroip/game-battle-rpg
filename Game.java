

public class Game {
    public static void main(String[] args) {
        // Membuat objek Weapon
        Weapon sword = new Weapon("Sword", 20);
        Weapon bow = new Weapon("Bow", 15);
        Weapon gloves = new Weapon("Gloves", 18);
        Weapon wand = new Weapon("Magic Wand", 25);

        // Membuat objek Race Hero
        Race knightRace = new Race("Knight", sword);
        Race archerRace = new Race("Archer", bow);
        Race fighterRace = new Race("Fighter", gloves);
        Race fairyRace = new Race("Fairy", wand);

        //Membuat objek Race Foe 
        Race OrcRace = new Race("Orc", sword);

        // Membuat objek Hero dan Foe dengan ras dan senjata yang sesuai
        Hero heroKnight = new Hero("Knight", 5, knightRace, sword, 5);
        Hero heroArcher = new Hero("Archer", 5, archerRace, bow, 3);
        Hero heroFighter = new Hero("Fighter", 5, fighterRace, gloves, 7);
        Hero heroFairy = new Hero("Fairy", 5, fairyRace, wand, 2);

        Foe Orc = new Foe("Orc", 5, OrcRace, sword);

        heroKnight.displayStatus();
        heroKnight.attack(Orc, 20);
        Orc.displayStatus();
        Orc.attack(heroArcher, 15);
        heroArcher.displayStatus();
        
    }
}

