public class RoomType extends Room {

    private String type;

    public RoomType (String type, int capacity, int price, int numberOfGuests){
        super(capacity, price, numberOfGuests);
        this.type = type;
    }

    public String getRoomType() {
        return this.type;
    }
}
