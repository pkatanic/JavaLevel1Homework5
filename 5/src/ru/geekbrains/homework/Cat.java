package ru.geekbrains.homework;

 class Cat extends Animal {

    public Cat(String name, String breed, int maxRun, int maxSwim, double maxJump) {
        super(name, breed, maxRun, maxSwim, maxJump);
        this.maxJump=(Math.random()*0.9+2);
        this.maxRun= random.nextInt(45) + 155;
        this.maxSwim=0;
        this.breed="Кот";
    }

    @Override
    void run(int dist) {
        if (maxRun>=dist)
            System.out.println(name + " пробежал" + dist + ".");
        else
            System.out.println(name + " не может пробежать " + dist);

    }

    @Override
    void jump(double height) {
        if(maxJump>=height)
            System.out.println(name + " прыгнул" + height + ".");
        else
            System.out.println(name + " не может прыгнуть " + height);

    }

    @Override
    void swim(int dist) {
        System.out.println("Кот не умеет плавать!");
    }

     @Override
     void info() {
         String maxJumpFormat = String.format("%.2f",maxJump);
         System.out.println(breed + " " + name + " может пробежать не более " + maxRun + " метров. "+ breed + "  не умеeт плавать. " +maxSwim + " Может прыгнуть  " + maxJumpFormat + " сантиметров" );
     }
 }
