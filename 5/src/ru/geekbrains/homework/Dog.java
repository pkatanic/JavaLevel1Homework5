package ru.geekbrains.homework;

public class Dog extends Animal {
    public Dog(String name, String breed, int maxRun, int maxSwim, double maxJump) {
        super(name, breed, maxRun, maxSwim, maxJump);
        this.maxJump=(Math.random()*0.8+0.9);  // в книге Гинесса записан рекод прыжка вверх собаки от 172 сантиметров. До этого 167.7.
        this.maxRun=random.nextInt(300)+300;
        this.maxSwim = random.nextInt(6)+5;
        this.breed="Собака";
    }

    @Override
    void run(int dist) {
        if (maxRun>=dist)
            System.out.println(name + " пробежала" + dist + ".");
        else
            System.out.println(name + " не может пробежать " + dist);
    }

    @Override
    void jump(double height) {
        if(maxJump>=height)
            System.out.println(name + " прыгнула" + height + ".");
        else
            System.out.println(name + " не может прыгнуть " + height);
    }

    @Override
    void swim(int dist) {
        if(maxSwim>=dist)
            System.out.println(name + " проплыла " + dist + ".");
        else
            System.out.println(name + " не может проплыть  " + dist);

    }

    @Override
    void info() {
        String maxJumpFormat = String.format("%.2f",maxJump);
        System.out.println(breed + " " + name + " может пробежать не более " + maxRun + " метров." + name + " может проплыть не более " + maxSwim + " метров." +"  прыгнуть " + maxJumpFormat + " сантиметров" );
    }
}
