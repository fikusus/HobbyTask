package TaskHobby;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static final Logger log = Logger.getLogger(Test.class);
    private static ArrayList<Hobby> hobbyList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Введите желаемое количество объектов класса Hobby");
        Scanner scn = new Scanner(System.in);
        int numberOfHobby = scn.nextInt();
        log.info("Количество объектов " + numberOfHobby);
        scn = new Scanner(System.in);
        System.out.println("Введите параметры объекта вида:");
        System.out.println("1)char firstLetterInTitle, short howManyYears, String yourFavoritePlayer");
        System.out.println("2)char firstLetterInTitle, short howManyYears, byte howMuchHourInDay, int recordFish");
        //Создание объектов
        for (int i = 0; i < numberOfHobby; i++) {
            //Разделение введенной строки по пробелам
            String[] str = scn.nextLine().split(" ");
            log.debug("Количество введенных символов " + str.length);
            if (str.length != 1 && str.length != 2 && str.length != 3) {
                log.error("Неверное количество символов");
            }
            //Создание объектов с разными конструкторами в зависимости от количества введенных элементов
            if (str.length == 3) {
                hobbyList.add(new Football(str[0].charAt(0), Short.parseShort(str[1]),str[2]));
            } else {
                hobbyList.add(new Fishing(str[0].charAt(0), Short.parseShort(str[1]), Byte.parseByte(str[2]),Integer.parseInt(str[3])));
            }
        }

        //Вывод информации про объекты
        for (Hobby i:hobbyList) {
            i.tellAboutHobby();
        }

    }

}