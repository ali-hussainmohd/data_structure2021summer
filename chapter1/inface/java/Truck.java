package chapter1.inface.java;

public class Truck implements Vehicle{

    private int sittingCapacity,yearModel;
    private String manufacturer,color;
    private double price;

    public Truck(int sittingCapacity, int yearModel, String manufacturer, String color, double price) {
        this.sittingCapacity = sittingCapacity;
        this.yearModel = yearModel;
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }

    @Override
    public int getSittingCapacity() {
        return sittingCapacity;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int age() {
        return 2018 - yearModel ;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "sittingCapacity=" + sittingCapacity +
                ", yearModel=" + yearModel +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
