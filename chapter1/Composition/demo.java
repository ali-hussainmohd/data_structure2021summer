package chapter1.Composition;

public class demo {
    public static void main(String[] args) {
        //int bu, int ro, int bl, String ar, float floorArea, int numOfFloors)
        building b1 = new building(375,222,108,"Tubli",200f,4);
        b1.getAddress().setArea("jidAli");
        System.out.println("b1.getAddress() = "+b1.getAddress().getArea());
        b1.print();
    }//main
}
