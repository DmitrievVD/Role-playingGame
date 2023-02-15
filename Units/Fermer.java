package Units;
/**
 * Крестьянин
 */
public class Fermer extends Unit{
    /**
     * Еда
     */
    protected int food;
    /**
     * Боеприпасы
     */
    protected int cartriges;


    public Fermer(String name){
        super(name);
        this.food = 20;
        this.cartriges = 50;
    }

    public Fermer(String name, int hp, int levl, int power, boolean step, int food, int cartriges) {
        super(name, hp, levl, power, step);
        this.food = food;
        this.cartriges = cartriges;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я фермер!!";
    }

    /**
     * Дать боеприпасы
     */
    public int getCartriges() {
        return 10;
    }

    /**
     * Дать еду
     */

    public int getFood() {
        return 10;
    }
}
