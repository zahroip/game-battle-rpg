public class Elf extends Foe implements ISkillHealing, IApplyStatus{
    
    public Elf(String name, int level){
        super(name, level);
    }

    //skill lullaby Elf 
    public void applyStatus(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
            this.MP -= 10;
            opponent.sleepStatus = true;
            System.out.println(this.name + " tidak bisa menyerang.");
            System.out.println(opponent.name + " sleep status: " + opponent.sleepStatus);
           
        }
    }

    //Elf skill recover 
    public void useSkillRecover(){
        System.out.println(this.name + " menggunakan skill recover.");
        this.MP +=20;
    }

    //Elf skill healing implement interface ISkillHealing
    public void skillHealing(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
            System.out.println(this.name + " menggunakan skill healing");
            this.MP -= 10;
            opponent.HP+=20;
        }
    }

}
