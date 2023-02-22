package Units;
/**
 * Маги
 */
public class Mag extends Magic{


    public Mag(String name) {
        super(name, 9, 30, 12, -5, -5, 0, 0, 17, true);
    }

    @Override
    public String getInfo() {
        return "Я маг!!!";
    }

    @Override
    public String toString() {
        return String.format("Колдун: %s  |  HP: %d  |  Speed: %d  |  ATK: %d - %d  |  DEF: %d  |  (X,Y): (%d,%d)\n", this.name, this.hp, this.speed, this.damegeMin, this.damegeMax, this.def, this.pos.x, this.pos.y);
    }
}
