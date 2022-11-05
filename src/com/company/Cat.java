package com.company;

final class Cat extends Pet {
    private String name;
    private String breed;
    private AnimalFamily family;

    public Cat(String consumer, String habitat, int age, String name, String breed, AnimalFamily family) {
        super(consumer, habitat, age);
        this.name = name;
        this.breed = breed;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public AnimalFamily getFamily() {
        return family;
    }

    @Override
    public void eat(String food) {
        System.out.println(name+" is eating "+food);
    }

    @Override
    public String getInfo() {
        return name+"'s consumer is"+ getConsumer()+
                "\n habitat is "+ getHabitat()+
                "\n family is " + family.toString()+
                "\n breed is "+ breed+
                "\n age is "+getAge()+" years old";
    }
}
