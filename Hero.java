public class Hero extends Character{
    
    public Hero(String name, int level){
        super(name, level);
    }

    public void attack(Character opponent){
        System.out.println(this.name + " menyerang " + opponent.name);
        opponent.HP -= 20;
    }

    public void skill(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
        System.out.println(this.name + " menggunakan skill.");
        this.MP -= 10;
        opponent.HP -= 20;
        }
    }

    public void usePotion(){
        this.HP += 100;
        System.out.println(this.name + " menggunakan Potion.");
        System.out.println("HP " + this.name + " menjadi " + this.HP);
    }

    public void useElixir(){
        this.HP += 150;
        this.MP += 100;
        System.out.println(this.name + " menggunakan Elixir.");
        System.out.println("HP " + this.name + " menjadi " + this.HP);
        System.out.println("MP " + this.name + " menjadi " + this.MP);
    }

    public void useEther(){
        this.MP += 100;
        System.out.println(this.name + " menggunakan Ether.");
        System.out.println("MP " + this.name + " menjadi " + this.MP);
    }
}
