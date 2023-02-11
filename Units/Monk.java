package Units;

/**
 *  Монах
 */
public class Monk extends  Unit{
    /**
     *  Мотивация
     */
    int motivation;
    /**
     * Боевой навык
     */
    int combatSkill;


    public Monk(String name, int hp, int levl, int power, boolean step, int motivation, int combatSkill) {
        super(name, hp, levl, power, step);
        this.motivation = motivation;
        this.combatSkill = combatSkill;
    }

    /**
     * Удар
     */
    public void hit(){

    }
    /**
     * Замотивировать
     */
    public void getMotivation(){

    }

}
