package Units;
/**
 * Маги
 */
public class Mag extends Magic{


    public Mag(String name) {
        super(name, 9, 30, 12, -5, -5, 0, 0, 17, true);
    }

    @Override
    public String getInfo() {
        return "Я маг!!!";
    }



}
