package Units;
/**
 * Кпоейщики
 */
public class Spearman extends Unit{
    /**
     * Держать строй
     */
    protected boolean keepInLine;

    public Spearman(String name, int hp, int levl, int power, boolean step, boolean keepInLine) {
        super(name, hp, levl, power, step);
        this.keepInLine = keepInLine;
    }

    /**
     * Если нужна помощь
     */
    public void needHelp(){

    }

    /**
     * Захват территории
     */
    public void capture(){

    }

}
