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

    public Crossbowman(String name, int hp, int levl, int power, boolean step, int arrows, int concentration, boolean keepInLine) {
        super(name, hp, levl, power, step);
        this.arrows = arrows;
        this.concentration = concentration;
        this.keepInLine = keepInLine;
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
