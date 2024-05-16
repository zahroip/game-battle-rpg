public class Fighter extends Hero {
    
    public Fighter(String name, int level){
        super(name, level);
    }

    Weapon SarungTangan = new Weapon("Sarung Tangan", 20);

    @Override
    //Fighter menyerang menggunakan Sarung Tangan
    public void attack(Character opponent){
        System.out.println(this.name + " menyerang " + opponent.name + " menggunakan " + SarungTangan.getName());
        opponent.HP -= SarungTangan.getAP();
    }
    
}
