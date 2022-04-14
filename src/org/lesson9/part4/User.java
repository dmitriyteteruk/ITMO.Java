package org.lesson9.part4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        User user4 = new User("User4");

        Map<User, Integer> map = new HashMap<>();

        map.put(user1, 10);
        map.put(user2, 20);
        map.put(user3, 30);
        map.put(user4, 40);

        showAllUsers(map);

        System.out.println("\nВведите имя участника: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        searchScoreByUser(map, searchName);

    }

    public static void showAllUsers (Map <User, Integer > map){
        System.out.println("Все участники и очки: ");
        for (Map.Entry<User, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey().getName());
        }
    }

    public static void searchScoreByUser (Map <User, Integer> map, String searchName){

        for (Map.Entry<User, Integer> pair : map.entrySet()){
            if (pair.getKey().getName().equals(searchName)){
                System.out.println("Баллы участника: " + pair.getValue());
            } else if (pair.getKey().getName() != searchName){
                System.out.println("Такой участник не найден");
                break;
            }
        }
    }
}


