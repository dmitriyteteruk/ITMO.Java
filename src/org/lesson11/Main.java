package org.lesson11;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        File fileToRead = new File("src/org/lesson11/files/textfile01.txt");
        File fileToWrite = new File("src/org/lesson11/files/textfile02.txt");
        File joinedFiles = new File("src/org/lesson11/files/textfile03.txt");
        File fileWithReplacedChars = new File("src/org/lesson11/files/textfile04.txt");

        // задача 1 - Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
        System.out.println("Задача 1: Написать метод, который читает текстовый файл и возвращает его в виде списка строк.");
        System.out.println(readFileWriteToString(fileToRead));

        System.out.println("Задача 2: Написать метод, который записывает в файл строку, переданную параметром.");
        writeStringIntoFileFromParameters("write this to new file"); // добавьте строку в параметр

        System.out.println("Задача 3: Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.");
        joinTwoFilesInOne(fileToRead, fileToWrite, joinedFiles);

        System.out.println("Задача 3: Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.");
        replaceCharsWith$Sign(joinedFiles, fileWithReplacedChars);

    }

    // 2 метод - записываем в файл строку переданную параметром
    public static void writeStringIntoFileFromParameters(String string){
        File fileToWrite = new File("src/org/lesson11/files/textfile02.txt");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(fileToWrite);
            fileWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    // 3 метод - склеиваем два файла
    public static void joinTwoFilesInOne(File file1, File file2, File file3){

        InputStream inputStream1 = null;
        InputStream inputStream2 = null;
        OutputStream outputStream = null;
        try {
            inputStream1 = new FileInputStream(file1);
            inputStream2 = new FileInputStream(file2);
            outputStream = new FileOutputStream(file3);

            while (inputStream1.available() > 0){
                outputStream.write(inputStream1.read());
            }

            while (inputStream2.available() > 0){
                outputStream.write(inputStream2.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if (inputStream1 != null && inputStream2 != null && outputStream != null){
                    inputStream1.close();
                    inputStream2.close();
                    outputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    // 1 метод - читаем текстовый файл и записываем в список строк
    public static  List<String> readFileWriteToString(File fileToRead) {
        List<String> stringList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
            String input = null;
            while ((input = bufferedReader.readLine()) != null){
                stringList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // переводит строку в список строк с разделнием через пробел.
        List<String> wordList = stringList.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
        // возвращаем список, а не строку.
        return wordList;
    }

    // 4 метод - заменяем все символьные знаки на знак "$"
    public static void replaceCharsWith$Sign(File file1, File file2){
        String string = null;

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

            String sting = null;
            while (inputStream.available() > 0){
                outputStream.write(inputStream.read());
            }
            while ((string = bufferedReader.readLine()) != null)
            {
                bufferedWriter.write(sting.replaceAll("[^а-яА-яa-zA-Z\\d]", "\\$"));
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (inputStream != null && outputStream != null){
                    inputStream.close();
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
