package chapter1.inface.java;

public interface Vehicle {

//getSittingCapacity: to return sitting capacity,
    public int getSittingCapacity();

//	getManufacturer: to return the manufacturer
    public String getManufacturer();
//	getPrice: to return price
    public double getPrice();

//	age: to return 2018 – yearModel // age of vehicle
    public int age();

//	getColor: return color
    public String getColor();

//	toString: to return String representation of all data fields.
    public String toString();
}
