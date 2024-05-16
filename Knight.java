public class Knight extends Hero{
    
    public Knight(String name, int level){
        super(name, level);
    }

    Weapon Pedang = new Weapon("Pedang", 20);
    @Override
    //Knight menyerang menggunakan Pedang
    public void attack(Character opponent){
        System.out.println(this.name + " menyerang " + opponent.name + " menggunakan " + Pedang.getName());
        opponent.HP -= Pedang.getAP();
    }
}
