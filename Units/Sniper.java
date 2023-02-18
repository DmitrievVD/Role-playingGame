package Units;

/**
 * Снайпер
 */
public class Sniper extends Arreys{


    public Sniper(String name) {
        super(name, 9, 15, 10, 8, 10, 0, 0, 12, 32);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }


}
