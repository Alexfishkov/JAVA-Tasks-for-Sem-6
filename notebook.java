public class notebook{
    String model;
    Double diagonal;
    Integer width;
    Integer height;
    Integer ram;
    Integer ssd;
    Double frequency;
    Integer capacity;
    Integer price;

    @Override
    public String toString(){
        return String.format("%s %.1f %d %d %d   %d %.1f  %d   %d", model, diagonal, width, height, ram, ssd, frequency, capacity, price);
    }

}