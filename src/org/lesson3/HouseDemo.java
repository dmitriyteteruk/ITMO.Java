package org.lesson3;
import java.util.Calendar;

class HouseDemo{
    public static void main(String arg[]) {
        House house = new House();

        // календарь добавлен для вычисления текущей даты в годах
        Calendar currentDate2 = Calendar.getInstance();
        int years = currentDate2.get(Calendar.YEAR); // перевод в int для совместимости с методом.

        // вызываеются метода один за одним.
        house.setAllParameters();
        house.showAllParameters();
        System.out.println("Возраст дома " + house.ageOfHouse(house.buildDate, years));
    }
}
