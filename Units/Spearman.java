package Units;
/**
 * Кпоейщики
 */
public class Spearman extends Unit{


    public Spearman(String name) {
        super(name, 4, 10, 5, 1, 3, 0, 0, 4);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }


}
