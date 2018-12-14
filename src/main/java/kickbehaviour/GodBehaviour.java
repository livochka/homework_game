package kickbehaviour;
import characters.Character;

public class GodBehaviour implements Behaviour{
    public void kick(Character main, Character enemy){
        enemy.setHp(0);
    }
}
