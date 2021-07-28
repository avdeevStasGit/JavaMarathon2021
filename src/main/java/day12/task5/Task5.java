package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы
 * есть не только имя, но и возраст. Соответственно, теперь под участником понимается не строка,
 * а объект класса MusicArtist.
 *
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса)
 * таким образом, чтобы участники были - объекты класса MusicArtist.
 *
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 * проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль
 * необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Кирилл", 28));
        members1.add(new MusicArtist("Чебурашка", 25));

        MusicBand band1 = new MusicBand("Черпаки", 2021, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Марти", 50));
        members2.add(new MusicArtist("Калорийка", 32));

        MusicBand band2 = new MusicBand("Астрономо", 2020, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
