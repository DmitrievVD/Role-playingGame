package Units;

import java.util.ArrayList;
import java.util.List;

/**
 * Кпоейщики
 */
public class Spearman extends Unit{


    public Spearman(String name) {
        super(name, 4, 10, 5, 1, 3, 0, 0, 4);
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {

    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }




}
