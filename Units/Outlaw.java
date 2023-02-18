package Units;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Разбойник
 */
public class Outlaw extends Unit {


    public Outlaw(String name) {
        super(name, 6, 10, 3, 2, 4, 0, 0, 8);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }




}
