public class Archer extends Hero{
    
    public Archer(String name, int level){
        super(name, level);
    }

    Weapon panah = new Weapon("Panah", 20);

    @Override
    //Archer menyerang menggunakan Panah
    public void attack(Character opponent){
        System.out.println(this.name + " memanah " + opponent.name + " menggunakan " + panah.getName());
        opponent.HP -= panah.getAP();
    }
}
