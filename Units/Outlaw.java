package Units;
/**
 * Разбойник
 */
public class Outlaw extends Unit {
    /**
     * Спрятаться
     */

    protected boolean hide;

    public Outlaw(String name, int hp, int levl, int power, boolean step, boolean hide) {
        super(name, hp, levl, power, step);
        this.hide = hide;
    }

    public Outlaw(String name){
        super(name);
        this.hide = false;
    }


    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    /**
     * Спрятаться
     */
    public void setHide(){

    }
    /**
     * Украсть
     */

    public void steal(){

    }

}
