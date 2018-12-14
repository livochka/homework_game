package characters;

import kickbehaviour.RandomBehaviour;

public class King extends AI {
    public King() {
        super(5, 15);
        this.behaviour = new RandomBehaviour();
    }

    public String toString(){
        return "King";
    }
}
