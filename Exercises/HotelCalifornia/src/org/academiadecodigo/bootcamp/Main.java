package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {

        Hotel hotelCalifornia = new Hotel();

        Person person1 = new Person("Daniel",Genders.MALE, 34);
        Person person2 = new Person("Artur", Genders.MALE, 33);
        Person person3 = new Person("Maria", Genders.FEMALE, 15);

    //    System.out.println(hotelCalifornia.rooms[0].getAvailable());
    //    System.out.println(hotelCalifornia.rooms[1].getAvailable());
    //    System.out.println(hotelCalifornia.rooms[2].getAvailable());

        hotelCalifornia.checkIn(person1,SoloDuo.SOLO,true);
        hotelCalifornia.checkIn(person2,SoloDuo.SOLO,true);
        hotelCalifornia.checkIn(person3,SoloDuo.DUO,true);

    //    System.out.println(hotelCalifornia.rooms[person1.getInHotel()].getAvailable());

        hotelCalifornia.checkOut(person1);
    //    System.out.println(hotelCalifornia.rooms[person1.getInHotel()].getAvailable());
        hotelCalifornia.checkOut(person2);
    //    System.out.println(hotelCalifornia.rooms[person2.getInHotel()].getAvailable());
        hotelCalifornia.checkOut(person3);
    //    System.out.println(hotelCalifornia.rooms[person3.getInHotel()].getAvailable());

    }
}
