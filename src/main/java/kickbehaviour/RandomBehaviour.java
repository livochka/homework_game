package kickbehaviour;
import characters.Character;
import config.Config;

public class RandomBehaviour implements Behaviour {
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));

    }
}
