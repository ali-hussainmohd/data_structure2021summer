package chapter1;

public class AddressType {

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
        public String getArea( ) { return area; }
        public void print( )
        {
            System.out.println("Building Number = " + buildingNum +
           "Road Number = " + roadNum + "Block Number = " + blockNum +
           "Area=  "+ area);
        }



}//class
