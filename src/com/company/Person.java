package com.company;

/**
 * Created by Piotr on 2017-05-06.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o){
       if (getAge()>o.getAge()){
           return -1;
       }else if (getAge() == o.getAge()){
           return 0;
       }else {
           return 1;
       }
    }

    @Override
    public String toString(){
        return "Person{" +
                "Name='" + name + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
