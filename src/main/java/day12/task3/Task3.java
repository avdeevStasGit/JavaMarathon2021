package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. *Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и
 * year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список.
 * Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
 * основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем
 * списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */

public class Task3 {
    public static void main(String[] args) {
        MusicBand beatles = new MusicBand("Beatles", 1980);
        MusicBand quin = new MusicBand("Quin", 2010);
        MusicBand brauni = new MusicBand("Brauni", 1997);
        MusicBand ramshtein = new MusicBand("Ramshtein", 2021);
        MusicBand alisa = new MusicBand("Alisa", 1986);
        MusicBand Tom = new MusicBand("Tom", 2018);
        MusicBand kabachok = new MusicBand("Kabachok", 1997);
        MusicBand Pop = new MusicBand("Pop", 2014);

        List<MusicBand> list = new ArrayList<MusicBand>();

        list.add(beatles);
        list.add(quin);
        list.add(brauni);
        list.add(ramshtein);
        list.add(alisa);
        list.add(Tom);
        list.add(kabachok);
        list.add(Pop);

        for(MusicBand text : list) {
            System.out.println(text.toString());
        }

        System.out.println("==============================================");
        Collections.shuffle(list);

        for(MusicBand text : list) {
            System.out.println(text.toString());
        }
        System.out.println("==============================================");
        groupsAfter2000(list);

    }


   public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groups2000 = new ArrayList<>();
        for(MusicBand band : bands) {
            if(band.getYear() > 2000) {
                groups2000.add(band);
            }
        }
       System.out.println(groups2000);
   return groups2000;
   }
}
