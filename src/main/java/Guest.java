public class Guest {

    private int guestId;
    private String name;
    private int age;

    public Guest(int guestId, String name, int age){
        this.guestId = guestId;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }
}
