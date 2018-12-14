package characters;

import java.util.Random;

import kickbehaviour.Behaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor

public abstract class Character {
    @Getter
    private  int power;
    @Getter
    private  int hp;
    public Behaviour behaviour;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        if (hp > 0){
            this.hp = hp;
        }
        else{this.hp = 0;} }

    public void setPower(int pow){
        if (pow > 0){
            this.power = pow;
        }
        else{this.power = 0;} }

}
