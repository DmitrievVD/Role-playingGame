package Units;


import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Arreys{ // Арбалетчик

    public Crossbowman(String name) {
        super(name, 4, 10, 3, 2, 3, 0, 0, 6, 16);
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
        super.step(t1, t2);
    }
}
