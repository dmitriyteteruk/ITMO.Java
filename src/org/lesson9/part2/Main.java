// написать метод, который на входе получает коллекцию объектов,
// а возвращает коллекцию без дубликатов
package org.lesson9.part2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(3);
        integerList.add(7);
        integerList.add(4);
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);

        System.out.println("Коллекция с дубликатами");
        System.out.println(integerList);
        System.out.println();

        System.out.println("Коллекция без дубликатами");
        System.out.println(getListReturnNoDoubles(integerList));


    }

    public static Set<Integer> getListReturnNoDoubles(ArrayList arrayList){
        Set<Integer> set = new HashSet<>();
        set.addAll(arrayList);
        return set;
    }

}
