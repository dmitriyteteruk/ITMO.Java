package org.lesson5;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {

        String firstString;
        String secondString;

        System.out.println("������ 1.1 - ������� ����� �����");
        System.out.println("������� ����� ������ ������:");
        Scanner scanner = new Scanner(System.in);
        firstString = scanner.nextLine();

        System.out.println("������� ����� ������ ������:");
        secondString = scanner.nextLine();
        compareStringLengths(firstString.length(), secondString.length());

        System.out.println("������ 1.2 - ����� ����� ������� ����� � �������");
        findLongestWord(firstString, secondString);

        System.out.println("\n\n������ 2 - ��������� ����� �� ���������");
        System.out.println("������� �����");
        String polyndrom = scanner.nextLine();
        checkForPolyndrom(polyndrom);

        System.out.println("\n\n������ 3 - �������� ����� \"����\" �� ������");
        System.out.println("������� ����� �� ������ \"����\"");
        String byakaString;
        byakaString = scanner.nextLine();
        byaka(byakaString);

        System.out.println("\n\n������ 4 - ����� ���������� ��������� ����� ������ � ������");
        String mainString;
        String subString;
        System.out.println("������� ����� ������ (��������) ������");
        mainString = scanner.nextLine();
        System.out.println("������� ����� ���������, �������� � �������� ������");
        subString = scanner.nextLine();
        countSubString(mainString, subString);

        System.out.println("\n\n������ 5 - �������� �����, ������� ����������� ����� � ������. \n" +
                "����� ������������ \"byakaString\" � �������� ��������� ��� ��������");
        stringInversion(byakaString);

    }

    public static void compareStringLengths(int a, int b){


        if (a == b){
            System.out.println("����� ����� ����������");
        }
        else if (a > b) {
            System.out.println("������ ������ ������� ������");
        }
        else System.out.println("������ ������ ������� ������");
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
            System.out.println("����� ������� ����� � ���� �������: " + longest1);
        } else if (longest1.length() == longest2.length())
            System.out.println("����� ������� ����� � ���� �������: "
                    + longest1 + " � " + longest2 + ". �� ����� ���������.");
        else
            System.out.println("����� ������� ����� � ���� �������: " + longest2);

    }

    public static void checkForPolyndrom(String string){

        String s1 = string.toLowerCase();
        String s2 = new StringBuilder(string.toLowerCase()).reverse().toString();
        if (s1.equals(s2)){
            System.out.println("����� " + string + " ���������");
        } else
            System.out.println("����� " + string + " �� ���������");
    }

    public static void byaka(String string){
        String[] stringSplit = string.split(" ");

        for (int i = 0; i < stringSplit.length; i++){
            if (stringSplit[i].equalsIgnoreCase("����")){
                stringSplit[i] = "[�������� ��������]";
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String stringMerge : stringSplit ){
            builder.append(stringMerge)
                    .append(" ");
        }
        System.out.println("��������� ������ �������:");
        System.out.println(builder);
    }

    public static void countSubString(String string, String subString){
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println("���������� ��������� \"" + subString +  "\" � �������� ������ �����: " + counter);

    }

    public static void stringInversion(String string){
        String[] stringArray = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String stringReversed : stringArray){
            builder.append(new StringBuilder(stringReversed).reverse()
                    .append(" "));
        }
        System.out.println("�������� �������� \"byakaString\": \t" + string + "\n" +
                "������ ������ \"byakaString\": \t\t" + builder);

    }
}
