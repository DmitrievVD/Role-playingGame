package Units;
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
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я фермер!!";
    }


}
