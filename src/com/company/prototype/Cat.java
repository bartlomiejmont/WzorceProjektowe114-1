package com.company.prototype;

public class Cat implements Cloneable{

    public Cat createCatClone() throws CloneNotSupportedException {
        return (Cat) clone();
    }

    private String name;
    private Dog dog;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.dog = new Dog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog(){
        return this.dog;
    }
}
