package management;

import characters.Character;

public class GameManager {

    public void fight(Character ch1, Character ch2){
        System.out.println("The fight started!");
        System.out.println("Today on the arena...");
        Character c = ch1;
        Character first = ch1;
        Character second = ch2;
        int round = 1;
        while (ch1.getHp() > 0 & ch2.getHp() > 0){
            System.out.println("Round " + round);
            round += 1;

            System.out.println(getInfo(first));
            System.out.println(getInfo(second));
            System.out.println(first + " attacking!");

            int previousHp = second.getHp();
            int previousPower = second.getPower();


            kick(first, second);
            int hpLoss = second.getHp() - previousHp;
            int powLoss = second.getPower() - previousPower;

            System.out.println("Oh no! " + second + " loss: hp - " + hpLoss + " pow - " + powLoss + "\n");

            first = second;
            second = c;
            c = first;

        }

        if (ch1.getHp() <= 0){
            System.out.println(ch2 + " won!");
        }
        else{
            System.out.println(ch1 + " won!");
        }

    }

    public void kick(Character ch1, Character ch2){
            ch1.kick(ch2);
    }

    public String getInfo(Character ch){
        return ch.toString() + ", hp = " + ch.getHp() + ", power = " + ch.getPower();
    }
}
