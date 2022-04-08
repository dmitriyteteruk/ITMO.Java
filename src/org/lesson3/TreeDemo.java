package org.lesson3;

class TreeDemo{
    public static void main(String arg[]){
        int a = 10;
        boolean i = true;
        String n = "New";
        Tree tree1 = new Tree(); // пустой
        Tree tree2 = new Tree(a, n); // 2 параметра
        Tree tree3 = new Tree(a, i, n); // 3 параметра
    }
}
