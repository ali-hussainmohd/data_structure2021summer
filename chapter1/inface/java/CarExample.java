package chapter1.inface.java;

public class CarExample {
    //Write a Java application called CarExample having only main method to test your class Car.
    // Create an object myCar of type Car having following values of data fields:
    //sittingCapacity = 5; manufacturer = “BMW”; price = 15400; yearModel = 2016; color = “Red”;
    public static void main(String[] args) {
        //public Car(int sittingCapacity, int yearModel, String manufacturer, String color, double price) {
        Car myCar = new Car(5,2016,"BMW","red",15400);
        System.out.println(myCar);

        Vehicle automative = new Truck(3,2018,"MD","blue",20000);

        System.out.println(automative);

    }
}//class
