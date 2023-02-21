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




}
