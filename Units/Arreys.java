package Units;

public class Arreys extends Unit{



    int shoot; // выстрелы

    public Arreys(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack, int shoot) {
        super(name, speed, maxHp, def, damegeMin, damegeMax, x, y, attack);
        this.shoot = shoot;
    }
}
