package Units;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *  Монах
 */
public class Monk extends  Magic{


    public Monk(String name) {
        super(name, 5, 30, 7, -4, -4, 0, 0, 12, true);
    }


    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я монах!!! ";
    }




}
