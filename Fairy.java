public class Fairy extends Hero implements ISkillHealing{ 
    
    public Fairy(String name, int level){
        super(name, level);
    }

    //Fairy skill healing implement interface ISkillHealing
    public void skillHealing(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
            System.out.println(this.name + " menggunakan skill healing");
            this.MP -= 10;
            opponent.HP+=20;
        }
    }

    Weapon MagicWand = new Weapon("Magic Wand", 20);
    @Override
    //Fairy menyerang menggunakan Magic Wand
    public void attack(Character opponent){
        System.out.println(this.name + " menyerang " + opponent.name + " menggunakan " + MagicWand.getName());
        opponent.HP -= MagicWand.getAP();
    }

}
