package Units;

import java.util.ArrayList;
import java.util.List;

/**
 * Разбойник
 */
public class Outlaw extends Unit {


    public Outlaw(String name) {
        super(name, 6, 10, 3, 2, 4, 0, 0, 8);
    }





    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    @Override
    public String toString() {
        return String.format("Разбойник: %4s  |  HP: %d  |  Speed: %d  |  ATK: %d-%d  |  DEF: %d  |  (X,Y): (%d,%d)\n", this.name, this.hp, this.speed, this.damegeMin, this.damegeMax, this.def, this.pos.x, this.pos.y);
    }
}
