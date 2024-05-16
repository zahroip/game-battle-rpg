public class Dragon extends Foe implements IApplyStatus{
    
    public Dragon(String name, int level){
        super(name, level);
    }

     //skill fire Dragon 
    public void applyStatus(Character opponent){
        if(checkMP() == false){
            System.out.println("Tidak dapat menggunakan Skill karena MP kurang");
        }else{
            this.MP -= 10;
            opponent.weakStatus = true;
            int damage = 0 ;
            damage += 10;
        System.out.println("Damage dari " + this.name + " bertambah menjadi " + damage);
            System.out.println(opponent.name + " weak status: " + opponent.weakStatus);
        }
    }

}
