
import characters.Hobbit;
import config.Config;
import factory.CharacterFactory;
import characters.Character;
import management.GameManager;

public class Main {
    public static void main(String[] args) {
        CharacterFactory fac = new CharacterFactory();
        Character ch1 = fac.createCharacter();
        Character ch2 = fac.createCharacter();

        // in this case the game will last forever
        while (ch1 instanceof Hobbit & ch2 instanceof  Hobbit){
            ch2 = fac.createCharacter();
        }

        GameManager PM = new GameManager();
        PM.fight(ch1, ch2);



    }
}
