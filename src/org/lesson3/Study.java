// 1. Допишите в класс «Study» конструктор, что будет принимать один параметр
// и будет устанавливать значение этого параметра в поле «course».
// Создайте объект класса «Study». В качестве значения для поля «course»
// установите текст: «Изучение Java - это просто!».
// Обратитесь к методу «printCourse» для вывода значения поля «course».

package org.lesson3;

class Study {

    private String course;
    private int hours;

    // добавляем параметры в виде строки с названием и количеством часов.
    public Study(String courseName){
        course = courseName;

    }

    public String printCourse() {
        return this.course;
    }

}

class JavaProgram {
    public static void main(String[] args) {
        String course = "Изучение Java это не очень просто";

        Study study = new Study(course);

        System.out.println(study.printCourse());



    }
}
