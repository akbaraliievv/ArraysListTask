import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.
        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("Milan");
        arrayList.add("Barcelona");
        arrayList.add("Almaty");
        arrayList.add("Bishkek");
        System.out.println("arrayList = " + arrayList);
//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
            arrayList.add(0,"Madrid");
        System.out.println("arrayList = " + arrayList);
//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
        System.out.println("arrayList.get(3) = " + arrayList.get(3));
//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        System.out.println("arrayList.set(4) = "+arrayList.set(1,"Stambul"));
        System.out.println(arrayList);
//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        System.out.println("arrayList.remove(5) = " + arrayList.remove(2));
//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
        System.out.println("arrayList.contains(\"Bishkek\" (6)) = " + arrayList.contains("Bishkek"));
//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
        Collections.sort(arrayList);
        System.out.println("arrayList (7) = " + arrayList);
//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
        ArrayList<String>list = new ArrayList<>();
        list.add("Osh");
        list.add("Naryn");
        list.add("Kara=Kol");
        list.add("Talas");
        Collections.copy(arrayList,list);
        System.out.println("arrayList  (8)= " + arrayList);
        System.out.println("list (8) = " + list);
//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.
       Collections.shuffle(arrayList,new Random());
        System.out.println("arrayList (9) = " + arrayList);
//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
          Collections.reverse(arrayList);
        System.out.println("arrayList  (10) = " + arrayList);
//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
        System.out.println("arrayList.subList(10) = " + arrayList.subList(1, 3));
    }

}