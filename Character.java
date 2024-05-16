public abstract class Character{
    protected String name;
    protected int HP;
    protected int MP;
    protected int level;
    protected int armor;
    protected boolean weakStatus;
    protected boolean poisonStatus;
    protected boolean sleepStatus;
    protected Weapon weapon;

    public Character(String name, int level){
        this.name=name;
        this.level = level;
        this.HP = level * 100;
        this.MP = level * 50;
    }

    public abstract void attack(Character opponent);

    public abstract void skill(Character opponent);

    public boolean checkMP(){
        if(this.MP<20){
            return false;
        }else{
            return true;
        }
    }

    public void useArmor(int armor, Weapon weapon){
        int weaponAP = weapon.getAP();
        weaponAP -= armor;
        System.out.println(this.name + " menggunakan Armor, AP senjata menjadi " + weaponAP);
    }

    public void itemRemedy(){
        weakStatus = false;
        poisonStatus = false;
        sleepStatus = false;
        System.out.println(this.name + " weak status: " + weakStatus);
        System.out.println(this.name + " poison status: " + poisonStatus);
        System.out.println(this.name + " sleep status: " + sleepStatus);
    }

    public void itemAntidote(){
        poisonStatus = false;
        System.out.println(this.name + " poison status: " + poisonStatus);
    }

    public void display(){
        System.out.println("Nama: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.HP);
        System.out.println("MP: " + this.MP + "\n");
    }

}