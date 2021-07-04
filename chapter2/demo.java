package chapter2;
import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {


        ArrayList arrayClass = new ArrayList(20);
        arrayClass.add(5000.52);
        arrayClass.add(205);
        System.out.println(arrayClass.size());
        System.out.println(arrayClass.isEmpty());


        kwArraylist<String> arratkw = new kwArraylist();
        System.out.println(arratkw.size());
        System.out.println(arratkw.isEmpty());
        System.out.println(arratkw.toString());


    }//main
}//class
