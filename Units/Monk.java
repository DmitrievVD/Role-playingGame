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

    public Monk(String name){
        super(name);
        this.motivation = 100;
        this.combatSkill = 1;
    }


    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я монах";
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
