package ru.geekbrains.homework;

import java.util.Random;

abstract class Animal {
    protected   String name;
    protected String breed;
    protected  int maxRun;
    protected  int maxSwim;
    protected  double maxJump;

    public Random random = new Random();

    abstract void run(int dist);
    abstract void jump(double height);
    abstract void swim(int dist);
    abstract void info();

    public Animal(String name, String breed, int maxRun, int maxSwim, double maxJump) {
        this.name = name;
        this.breed = breed;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }


}
