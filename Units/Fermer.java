package Units;

import java.util.ArrayList;
import java.util.List;

/**
 * Крестьянин
 */
public class Fermer extends Unit{
    protected boolean delivery;


    public Fermer(String name) {
        super(name, 3, 1, 1, 1, 1, 0, 0, 1);
        this.delivery = true;
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {

    }

    @Override
    public String getInfo() {
        return "Я фермер!!";
    }


}
