package kickbehaviour;
import characters.Character;

public class OrdinaryBehaviour implements Behaviour {
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp() - main.getPower());
    }
}
