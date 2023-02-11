package Units;

/**
 * Снайпер
 */
public class Sniper extends Unit{
    /**
     * Маскировка
     */
    protected int disguise;
    /**
     * Концентрация
     */
    protected int concentration;
    /**
     * Патроны
     */
    protected int cartriges;

    public Sniper(String name, int hp, int levl, int power, boolean step, int disguise, int concentration, int cartriges) {
        super(name, hp, levl, power, step);
        this.disguise = disguise;
        this.concentration = concentration;
        this.cartriges = cartriges;
    }

    /**
     * Маскируется
     */
    public void setDisguise(){

    }

    /**
     * Выстел
     */
    public void shot(){

    }

}
