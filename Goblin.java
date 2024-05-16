public class Goblin extends Foe implements IApplyStatus{
    
    public Goblin(String name, int level){
        super(name, level);
    }

    //skill gigit Goblin
    public void applyStatus(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
            this.MP -= 10;
            opponent.poisonStatus = true;
            opponent.HP -= 20;
            System.out.println(opponent.name + " poison status: " + opponent.poisonStatus);
        }
    }

}
