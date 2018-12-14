package characters;

public class Hobbit extends Character {
    public Hobbit()  { super (0, 3);}

    public void kick(Character a){
        this.toCry();
    }
    private void toCry() {
        System.out.println("cry cry cry");
    }

    public String toString(){
        return "Hobbit";
    }

}
