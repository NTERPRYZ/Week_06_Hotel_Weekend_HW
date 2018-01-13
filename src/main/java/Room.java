import java.util.ArrayList;

public class Room {
   private int capacity;
   private int price;
   private int numberOfGuests;


    public Room(int capacity, int price, int numberOfGuests){
        this.capacity = capacity;
        this.price = price;
        this.numberOfGuests = numberOfGuests;
    }



    public int getRoomCapacity() {
        return this.capacity;
    }

    public int getRoomPrice() {
        return this.price;
    }

    public int getNumberOfGuests() {
        return this.numberOfGuests;
    }
}
