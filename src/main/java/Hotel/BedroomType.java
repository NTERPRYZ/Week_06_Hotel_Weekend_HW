package Hotel;

public enum BedroomType {

    SINGLE (1, 50),
    DOUBLE (2, 100);

    final int capacity;
    final int price;

    BedroomType(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }
}