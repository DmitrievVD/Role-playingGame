package org.example;

import Units.Crossbowman;
import Units.Outlaw;
import Units.Spearman;
import Units.Unit;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("Rob", 100, 1, 100, false);
        unit.wakeUp();
        System.out.println(unit);

        Outlaw outlaw = new Outlaw("Jhon", 100, 1, 100,false, false);
        outlaw.wakeUp();
        outlaw.setHide();
        System.out.println(outlaw);

        Spearman spearman = new Spearman("Bob", 100, 1, 100, false, false);
        spearman.needHelp();






    }
}
//крестьянин
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать
//        Возделывание полей;
//        Питание;
//          Выносливость;
//          под
//
//разбойник
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать
//        жестокость;
//        разбой;
//          Выносливость;
//
//
//
//снайпер
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
//          Выносливость;
//         Боеприпасы
//          Бегать;
меткость;
маскировка;
замирание;
 */

//колдун
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать;
            мана
            артифакты
//          Выносливость;
 */
//копейщик
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать;
//          Выносливость;
//          владение копьем
//          умение держать строй
//арбалетчик
////          Имя;
////          здоровье;
////          спать;
////          Ходить;
///*          Бегать;
////          Выносливость;
//            меткость
//            боеприпасы
 */
