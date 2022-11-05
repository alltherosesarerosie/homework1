package com.company;

public class Pet extends Animal{
    private int age;

    public Pet(String consumer, String habitat, int age) {
        super(consumer, habitat);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    final public void eat(){
        System.out.println("Pet is eating");
    }

    public void eat(String food){
        System.out.println("Pet is eating "+food);
    }

    public String getInfo(){
        return "Animal's consumer is"+ getConsumer()+
                "\n habitat is "+ getHabitat()+
                "\n age is "+age+" years old";

    }


}
