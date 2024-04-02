package com.classdemo;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
public static void main(String[] args) {
    Person person1 = new Person("Mansi Patil", 21);
    Person person2 = new Person("Pooja Patil", 22);
    System.out.println(person1.getName() + " : " + person1.getAge() + " years old.");
    System.out.println(person2.getName() + " : " + person2.getAge() + " years old.\n");
  }
}
