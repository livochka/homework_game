package characters;

public class Elf extends Character {
    public Elf()  { super (10, 10);}

    public void kick(Character a){
        if (a.getPower() < this.getPower()){
            a.setHp(0);
        } else {
            a.setPower(a.getPower()-1);
        }
    }

    public String toString(){
        return "Elf";
    }
}
