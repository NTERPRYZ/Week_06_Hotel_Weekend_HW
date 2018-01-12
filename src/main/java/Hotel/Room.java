package Hotel;

public class Room {

   private String type;
   private int capacity;
   private int price;
   private int numberOfGuests;


    public Room(String type, int capacity, int price, int numberOfGuests){
        this.type = type;
        this.capacity = capacity;
        this.price = price;
        this.numberOfGuests = numberOfGuests;
    }


    public String getRoomType() {
        return this.type;
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
