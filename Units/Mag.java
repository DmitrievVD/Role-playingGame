package Units;
/**
 * Маги
 */
public class Mag extends Unit{
    /**
     * Кол-во маны
     */
    protected int mana;
    /**
     * Магическая книга
     */
    protected boolean magiсBook;

    public Mag(String name, int hp, int levl, int power, boolean step, int mana, boolean magiсBook) {
        super(name, hp, levl, power, step);
        this.mana = mana;
        this.magiсBook = magiсBook;
    }

    /**
     * Произнести заклинание
     */
    public void custSpell(){
        System.out.println("Кастует заклинание");
    }

}
