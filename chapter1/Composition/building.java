package chapter1.Composition;



public class building  {
//Write a class called building, having the following members:
//	Data members (private):
//•	address of type AddressType,
    private AddressType address; // not compelet obj
//•	floorArea of type float,
    private float floorArea;
//•	numOfFloors of type int.
    private int numOfFloors;
//	Methods (public):
//•	set and get methods for all three data members,

    public AddressType getAddress() {
        return address;
    }

    public void setAddress(AddressType address) {
        this.address = address;
    }

    public float getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(float floorArea) {
        this.floorArea = floorArea;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

//•	print method to print all attributes (including address),
    public void print(){
        address.print();
        System.out.printf("Floor Area= %.2f Number Of Floors = %d",floorArea,numOfFloors);
    }
//•	constructor with 6 parameters.

    public building(int bu, int ro, int bl, String ar, float floorArea, int numOfFloors) {
        address = new AddressType(bu,ro,bl,ar);
        this.floorArea = floorArea;
        this.numOfFloors = numOfFloors;
    }

    public  class AddressType {

    private int buildingNum; 	//Building number
    private int roadNum; 		// Road number
    private int blockNum; 	// Block number
    private String area;
    // constructor
    public AddressType(int bu, int ro, int bl, String ar)
    {
        buildingNum = bu;
        roadNum = ro;
        blockNum = bl;
        area = ar;
    }
    public void setAddress(int bu, int ro, int bl, String ar)
    {
        buildingNum = bu;
        roadNum = ro;
        blockNum = bl;
        area = ar;
    }
    public int getBuildingNum( ) { return buildingNum; }
    public int getRoadNum( ) { return roadNum; }
    public int getBlockNum( ) { return blockNum; }
    public void setArea(String area){ this.area=area;}
    public String getArea( ) { return area; }
    public void print( )
    {
        System.out.println("Building Number = " + buildingNum +
                " Road Number = " + roadNum + " Block Number = " + blockNum +
                " Area=  "+ area);
    }



}//class


}
