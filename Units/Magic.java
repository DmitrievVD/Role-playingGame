package Units;

public class Magic extends Unit{
    protected boolean magic;

    public Magic(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack, boolean magic) {
        super(name, speed, maxHp, def, damegeMin, damegeMax, x, y, attack);
        this.magic = magic;
    }
}
