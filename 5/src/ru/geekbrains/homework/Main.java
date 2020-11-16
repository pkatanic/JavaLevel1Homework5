package ru.geekbrains.homework;

public class Main {
    public static void main(String[] args){

        Cat cat1 = new Cat("Рикки","кот",200,0,2);
        cat1.info();
        System.out.println("-------------------");
        Cat cat2 = new Cat("Василий","кот",150,0,1.5);
        cat2.info();
        System.out.println("-------------------");

        Dog dog1 = new Dog("Бобик","собака",500,10,0.5);
        Dog dog2 = new Dog("Макс", "собака", 400, 7,0.4);
        dog1.info();
        dog2.info();
    }
}
