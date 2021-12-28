package com.geekbrains;
class Person {

    String nameSurname;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Person(String nameSurname, String position, String email, String phoneNumber, double salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printPersonInfo() {
        System.out.println();
        System.out.println("Сотрудник: " + nameSurname + " числится на должности - " + position);
        System.out.println("Возраст: " + age + " лет; Зарплата: " + salary + " руб");
        System.out.println("e-mail: " + email + "; phone number: " + phoneNumber);
    }
}

public class HomeWorkApp {
    public static void main(String[] args) {
        Person[] array = new Person[5];
        array[0] = new Person("Гаврилов Вадим", "начальник бюро", "gavr@yandex.ru", "89197866077", 70000, 45);
        array[1] = new Person("Бобровских Александр", "инженер 2 кат.", "Bobr@gmail.com", "89375533668", 35000, 32);
        array[2] = new Person("Яблокова Марина", "инженер 1 кат.", "Yablok@gb.net", "89053367236", 45000, 41);
        array[3] = new Person("Воробьева Юлия", "ведущий инженер", "vorobeu@yahoo.com", "89651176543", 55000, 35);
        array[4] = new Person("Пустовалов Олег", "зам. начальника бюро", "pusto@gmail.com", "89199855789", 60000, 55);

        for (Person person : array) {
            if (person.age > 40) {
                person.printPersonInfo();
            }
        }
    }
}
