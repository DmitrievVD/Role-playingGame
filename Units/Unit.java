package Units;

import java.util.ArrayList;
import java.util.Random;

/**
 * Основная боевая еденица
 */
public abstract class Unit implements GameInterface{
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
    public Unit(String name ){
        this.name = name;
        this.hp = 100;
        this.levl = 1;
        this.power = 100;
        this.step = false;
    }

    public Unit(String name, int hp, int levl, int power, boolean step) {
        this.name = name;
        this.hp = hp;
        this.levl = levl;
        this.power = power;
        this.step = step;
    }

    public static String setName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }

    public static void createArreyUnit(ArrayList<Unit> arrayList, ClassesUnits classesUnits){
        switch (classesUnits){
            case Sniper -> arrayList.add(new Sniper(setName()));
            case Mag -> arrayList.add(new Mag(setName()));
            case Monk -> arrayList.add(new Monk(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Outlaw -> arrayList.add(new Outlaw(setName()));
            case Spearman -> arrayList.add(new Spearman(setName()));
            case Crossbowman -> arrayList.add(new Crossbowman(setName()));
        }
    }



    /**
     * Данные персонажа
     * @return name
     */

    @Override
    public String toString() {
        return String.format("%s %d %d", name, hp, power);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }


}
