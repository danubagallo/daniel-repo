package org.academiadecodigo.bootcamp;

public class Person {
    private String name;
    private Genders gender;
    private int age;
    private int roomInHotel;

    public Person(String name, Genders gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.roomInHotel = 0;
    }

    public int getInHotel() {
        return roomInHotel;
    }

    public int setInHotel(int batata) {
        this.roomInHotel = batata;
        return this.roomInHotel;
    }

    public String getName() {
        return name;
    }

    public Genders getGender() {
        return gender;
    }

}
