package Units;

/**
 * Основная боевая еденица
 */
public class Unit {
    /**
     * Имя персонажа
     */
    protected String name;
    /**
     * Здоровье
     */
    protected int hp;
    /**
     * Уровень
     */
    int levl;
    /**
     * Энергия
     */
    protected int power;
    /**
     * Ходьба/бег
     */
    protected  boolean step;
    public Unit(String name, int hp, int levl, int power, boolean step){
        this.name = name;
        this.hp = hp;
        this.levl = levl;
        this.power = power;
        this.step = step;
    }

    /**
     * Персонаж создан
     */
    public void wakeUp(){
        System.out.println("Создан новый персонаж");
    }

    /**
     * Данные персонажа
     * @return name
     */

    @Override
    public String toString() {
        return String.format("%s %d %d", name, hp, power);
    }
}
