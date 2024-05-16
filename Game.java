public class Game {
    public static void main(String[] args) {
        
        Fairy fairy = new Fairy("Hero Fairy", 1);

        //upcasting melalui generalisasi, objek Hero diperlakukan sebagai objek Character
        System.out.println("Polimorfisme melalui generalisasi: \n");
        Character character1 = new Hero("Character Hero", 1);
        //character1.usePotion(); //error karena method usePotion() ada di class Hero, tidak didefinisikan di class Character
        System.out.println("Tidak dapat menggunkaan Potion");
        character1.display();
        
        if (character1 instanceof Hero) {
            Hero hero = (Hero) character1; //downcasting
            System.out.println("Setelah downcast: ");
            hero.usePotion(); // Memanggil method usePotion() dari Hero 
            System.out.println("Setelah downcast dapat menggunakan Potion.");
            hero.display();
        }else{
            System.out.println("Gagal melakukan downcasting");
        }


        //upcasting melalui interface 
        System.out.println("Polimorfisme melalui interface: \n");
        IApplyStatus character = new Elf("Elf", 1);
        System.out.println("Tidak dapat menggunakan skill healing dan menampilkan informasi.");
        //character.display(); //error karena method display() ada di class Character, tidak didefinisikan di IApplyStatus 
        
        if(character instanceof Elf){
            Elf characterElf = (Elf) character; //downcast
            System.out.println("Setelah downcast: ");
            characterElf.skillHealing(fairy); //memanggil method skillHealing dari Elf
            characterElf.display(); //dapat memanggil method display() karena sudah berubah bentuk menjadi Elf
            System.out.println("Setelah downcast dapat menggunakan skillHealing dan menampilkan informasi.");
        }else{
            System.out.println("Gagal melakukan downcasting");
        }


        //upcasting melalui class abstract
        System.out.println("Polimorfisme melalui class abstract: \n");
        Character character01 = new Elf("Character Elf", 1);
        System.out.println("Tidak dapat menggunakan skill recover.");
        //character01.useSkillRecover(); //error karena method useSKillRecover() ada di class Elf, tidak didefinisikan di Character
        character01.display();

        if(character01 instanceof Elf){
            Elf characterArcher = (Elf) character01; //downcast
            System.out.println("Setelah downcast: ");
            characterArcher.useSkillRecover(); //memanggil method useSkillRecover dari Elf
            System.out.println("Dapat menggunakan skill recover karena telah didowncast menjadi Elf.");
            characterArcher.display();
        }else{
            System.out.println("Gagal melakukan downcasting.");
        }
    }

}
