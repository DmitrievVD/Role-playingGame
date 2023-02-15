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

    public Mag(String name) {
        super(name);
        this.mana = 100;
        this.magiсBook = true;
    }


    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я маг!!!";
    }

    /**
     * Произнести заклинание
     */
    public void custSpell(){
        System.out.println("Кастует заклинание");
    }

}
