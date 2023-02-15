package Units;

/**
 * Арбалетчики
 */
public class Crossbowman extends Unit{
    /**
     * Кол-во стрел
     */
    protected int arrows;
    /**
     *  Концентрация
     */
    protected int concentration;
    /**
     * Держать строй
     */
    protected boolean keepInLine;



    public Crossbowman(String name){
        super(name);
        this.arrows = 10;
        this.concentration = 10;
        this.keepInLine = false;
    }

    public Crossbowman(String name, int hp, int levl, int power, boolean step, int arrows, int concentration, boolean keepInLine) {
        super(name, hp, levl, power, step);
        this.arrows = arrows;
        this.concentration = concentration;
        this.keepInLine = keepInLine;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

    /**
     * Выстрел
     */
    public void shoot(){

    }

    /**
     * Нужна помощь
     */

    public void  needHelp(){

    }
}
