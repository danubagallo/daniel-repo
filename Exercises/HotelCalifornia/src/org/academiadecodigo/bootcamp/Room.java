package org.academiadecodigo.bootcamp;

public class Room {
    private int roomFloor;
    private int roomDoor;
    private int roomNumber;
    private boolean available;
    private Person occupant;

    // single/double bed

    public Room(int roomFloor, int roomDoor, boolean available) {
        this.roomFloor = roomFloor;
        this.roomDoor = roomDoor;
        this.roomNumber = Integer.parseInt(String.valueOf(roomFloor) + String.valueOf(roomDoor));
        this.available = available;
    }

    public int getRoom() {
        return roomNumber;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
