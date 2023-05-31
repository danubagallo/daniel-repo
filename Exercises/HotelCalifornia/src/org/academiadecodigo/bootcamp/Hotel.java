package org.academiadecodigo.bootcamp;

public class Hotel {
    Room[] rooms = new Room[]{
            new Room(1, 1, true),
            new Room(1, 2, true),
            new Room(1, 3, true),
            new Room(1, 4, true),
            new Room(2, 1, true),
            new Room(2, 2, true),
            new Room(2, 3, true),
            new Room(2, 4, true),
    };

    private Person person;
    private SoloDuo requirement;
    private boolean airConditioner;


    public void checkIn(Person person, SoloDuo requirement, boolean airConditioner) {
        int guestRoom = (int) Math.floor(Math.random() * 8);

        while (rooms[guestRoom].getAvailable() == false) {
            guestRoom = (int) Math.floor(Math.random() * 8);
        }
        System.out.println("Room assigned to " + person.getName() + ": " + rooms[guestRoom].getRoom());
        rooms[guestRoom].setAvailable(false);
        person.setInHotel(guestRoom);
    }

    public void checkOut(Person person) {
        rooms[person.getInHotel()].setAvailable(true);
        System.out.println("Check-out of " + person.getName() + " successfully done. Room " + rooms[person.getInHotel()].getRoom() + " is now available.");
    }
}
