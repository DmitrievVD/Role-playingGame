package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Основная боевая еденица
 */
public abstract class Unit implements GameInterface {
    protected String name;
    protected int hp;
    protected int speed, attack;
    protected int maxHp, def, damegeMin, damegeMax;


    static int s1 = 1;
    static int s2 = 1;
    static int t1 = 10;
    static int t2 = 1;


    public Vector2D pos;

    public Unit(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack) {
        this.name = name;
        this.speed = speed;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.def = def;
        this.damegeMin = damegeMin;
        this.damegeMax = damegeMax;
        pos = new Vector2D(s1, s2);
        s2 ++;
        if (s2 > 10){
            pos = new Vector2D(t1, t2);
            t2++;
        }
        this.attack = attack;
    }

    public static String setName(){ // Дать случайное имя
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){ // Получаем случайного персонажа
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }

    public static void createArreyUnit1(ArrayList<Unit> arrayList, ClassesUnits classesUnits){ // Для создания Команды 1 (Список, setClass())
        switch (classesUnits){
            case Sniper -> arrayList.add(new Sniper(setName()));
//            case Mag -> arrayList.add(new Mag(setName()));
//            case Monk -> arrayList.add(new Mag(setName()));
//            case Fermer -> arrayList.add(new Fermer(setName()));
//            case Outlaw -> arrayList.add(new Outlaw(setName()));
//            case Spearman -> arrayList.add(new Sniper(setName()));
//            case Crossbowman -> arrayList.add(new Outlaw(setName()));

            case Mag -> arrayList.add(new Sniper(setName()));
            case Monk -> arrayList.add(new Sniper(setName()));
            case Fermer -> arrayList.add(new Sniper(setName()));
            case Outlaw -> arrayList.add(new Sniper(setName()));
            case Spearman -> arrayList.add(new Sniper(setName()));
            case Crossbowman -> arrayList.add(new Sniper(setName()));
        }
    }

    public static void createArreyUnit2(ArrayList<Unit> arrayList, ClassesUnits classesUnits){ // Для создания Команды 2 (Список, setClass())
        switch (classesUnits){
            case Monk -> arrayList.add(new Monk(setName()));
            case Mag -> arrayList.add(new Monk(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Spearman -> arrayList.add(new Spearman(setName()));
            case Outlaw -> arrayList.add(new Crossbowman(setName()));
            case Crossbowman -> arrayList.add(new Crossbowman(setName()));
            case Sniper -> arrayList.add(new Spearman(setName()));
        }
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed + "x: " + pos.x + " y: " + pos.y + "\n";
    }



    @Override
    public String getInfo() {
        return "Я человек!" + "HP: " + this.hp;
    }


    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
        GameInterface.super.step(t1, t2);
    }


    public void foo(){
        System.out.println(this);
    }
}
