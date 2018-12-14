package characters;

import config.Config;

public class AI extends Character{
    public AI(int min, int max) {super(Config.random.nextInt(max - min) + min + 1, Config.random.nextInt(max - min ) + 1);}

    public void kick(Character a){
        a.setHp(a.getHp() - Config.random.nextInt(this.getPower()));
    }
}
