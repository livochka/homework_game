package factory;

import characters.*;
import characters.Character;
import config.Config;
import lombok.SneakyThrows;

import java.util.HashMap;

public class CharacterFactory {
    /// not hash map
    public HashMap<Integer, Class<? extends Character>> hm;

    public CharacterFactory(){
        // REFLECTIONS LIBRARY
        hm = new HashMap<>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);


    }

    @SneakyThrows
    public Character createCharacter(){
        return hm.get(Config.random.nextInt(hm.size())).newInstance();
    }
}
