public class Bedroom {


    private BedroomType bedroomType;
    private int roomNumber;



    public Bedroom(BedroomType bedroomType, int roomNumber) {
        this.bedroomType = bedroomType;
        this.roomNumber = roomNumber;
    }

    public BedroomType getBedroomType(){
        return this.bedroomType;
        }


}