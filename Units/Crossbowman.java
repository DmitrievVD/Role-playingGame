package Units;


public class Crossbowman extends Arreys{ // Арбалетчик

    public Crossbowman(String name) {
        super(name, 4, 10, 3, 2, 3, 0, 0, 6, 16);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

}
