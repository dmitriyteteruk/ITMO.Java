package org.lesson5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {

        String firstString;
        String secondString;

        System.out.println("Задача 1.1 - сравить длину строк");
        System.out.println("Введите текст первой строки:");
        Scanner scanner = new Scanner(System.in);
        firstString = scanner.nextLine();

        System.out.println("Введите текст второй строки:");
        secondString = scanner.nextLine();
        compareStringLengths(firstString.length(), secondString.length());

        System.out.println("Задача 1.2 - найти самое длинное слово в строках");
        findLongestWord(firstString, secondString);

        System.out.println("\n\nЗадача 2 - проверить слово на палиндром");
        System.out.println("Введите слово");
        String polyndrom = scanner.nextLine();
        checkForPolyndrom(polyndrom);

        System.out.println("\n\nЗадача 3 - вырезать слово \"бяка\" из текста");
        System.out.println("Введите текст со словом \"бяка\"");
        String byakaString;
        byakaString = scanner.nextLine();
        byaka(byakaString);

        System.out.println("\n\nЗадача 4 - Найти количество вхождений одной строки в другую");
        String mainString;
        String subString;
        System.out.println("Введите текст первой (основной) строки");
        mainString = scanner.nextLine();
        System.out.println("Введите текст подстроки, входящей в основную строку");
        subString = scanner.nextLine();
        countSubString(mainString, subString);

        System.out.println("\n\nЗадача 5 - Напишите метод, который инвертирует слова в строке. \n" +
                "Будем использовать \"byakaString\" в качетсве параметра для инверсии");
        stringInversion(byakaString);

    }

    public static void compareStringLengths(int a, int b){


        if (a == b){
            System.out.println("Длина строк одинаковая");
        }
        else if (a > b) {
            System.out.println("Первая строка длиннее второй");
        }
        else System.out.println("Вторая строка длиннее первой");
        System.out.println();
    }

    public static void findLongestWord(String string1, String string2){
        String longest1 = Arrays.stream(string1.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        String longest2 = Arrays.stream(string2.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        if (longest1.length() > longest2.length()){
            System.out.println("Самое длинное слово в двух строках: " + longest1);
        } else if (longest1.length() == longest2.length())
            System.out.println("Самые длинные слова в двух строках: "
                    + longest1 + " и " + longest2 + ". Их длина одинакова.");
        else
            System.out.println("Самое длинное слово в двух строках: " + longest2);

    }

    public static void checkForPolyndrom(String string){

        String s1 = string.toLowerCase();
        String s2 = new StringBuilder(string.toLowerCase()).reverse().toString();
        if (s1.equals(s2)){
            System.out.println("Слово " + string + " полиндром");
        } else
            System.out.println("Слово " + string + " не полиндром");
    }

    public static void byaka(String string){
        String[] stringSplit = string.split(" ");

        for (int i = 0; i < stringSplit.length; i++){
            if (stringSplit[i].equalsIgnoreCase("бяка")){
                stringSplit[i] = "[вырезано цензурой]";
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String stringMerge : stringSplit ){
            builder.append(stringMerge)
                    .append(" ");
        }
        System.out.println("Результат работы цензора:");
        System.out.println(builder);
    }

    public static void countSubString(String string, String subString){
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println("Количество вхождений \"" + subString +  "\" в основную строку равно: " + counter);

    }

    public static void stringInversion(String string){
        String[] stringArray = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String stringReversed : stringArray){
            builder.append(new StringBuilder(stringReversed).reverse()
                    .append(" "));
        }
        System.out.println("Исходное значение \"byakaString\": \t" + string + "\n" +
                "Реверс строки \"byakaString\": \t\t" + builder);

    }
}
