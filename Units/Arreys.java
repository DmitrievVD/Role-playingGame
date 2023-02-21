package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Arreys extends Unit{



    int shoot; // выстрелы

    public Arreys(String name, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int attack, int shoot) {
        super(name, speed, maxHp, def, damegeMin, damegeMax, x, y, attack);
        this.shoot = shoot;
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
        Random rnd = new Random();
        if (t1.contains(this)) { // Проверка если он находиться в 1 команде
            int min = 20;
            int tmp;
            int index = 0;
            for (int i = 0; i < t2.size(); i++) { // Пробегаемся по второй команде находим дистанцию
                tmp = Vector2D.distance(this, (Unit) t2.get(i)); // Находит расстояние до врага
                if (min > tmp) {
                    min = tmp; // Записываем минимальную дистанцию врага
                    index = i; // Запрминаем индекс ближайшего врага
                }
            }
            System.out.println(t2.get(index));
            t2.get(index).hp = t2.get(index).hp - rnd.nextInt(this.damegeMin, this.damegeMax); // Выстрел в персонажа
            System.out.println(t2.get(index));
        } else { // Он будет находиться во 2й команде
            int min = 0;
            int tmp;
            int index = 0;
            for (int i = 0; i < t1.size(); i++) { // Пробегаемся по команде 1 находим дистанцию
                tmp = Vector2D.distance(this, (Unit) t1.get(i)); // Находит расстояние до врага
                if (min > tmp) {
                    min = tmp; // Записываем минимальную дистанцию врага
                    index = i; // Запрминаем индекс ближайшего врага
                }
            }
            System.out.println(t1.get(index));
            t1.get(index).hp = t1.get(index).hp - rnd.nextInt(this.damegeMin, this.damegeMin); // Выстрел в персонажа
            System.out.println(t1.get(index));
    }


    }
}
