public class Foe extends Character{
    
    public Foe(String name, int level){
        super(name, level);
    }

    public void attack(Character opponent){
        System.out.println(this.name + " menusuk " + opponent.name);
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

}
