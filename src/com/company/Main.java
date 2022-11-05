package com.company;

public class Main {
//Bengal
    public static void main(String[] args) {
        Pet pet1 = new Pet("herbivores","terrestrial", 2);
        AnimalFamily family1 = new AnimalFamily("felidae");
        Cat cat1 = new Cat("carnivore","terrestrial", 3, "Coco", "abyssinian ", family1);
        Cat cat2 = new Cat("carnivore","terrestrial", 5,"Belle","bengal",family1);

        pet1.eat();
        cat1.eat("fish");
        cat2.eat("meat");

        System.out.println("----------------");
        System.out.println(pet1.getInfo());
        System.out.println("----------------");
        System.out.println(cat1.getInfo());
        System.out.println("----------------");
        System.out.println(cat2.getInfo());

    }
}
