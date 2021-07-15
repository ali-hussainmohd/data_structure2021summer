package chapter2;
import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {


        ArrayList arrayClass = new ArrayList(20);
        /*arrayClass.add(10);
        arrayClass.add(20);
        arrayClass.add(50);
        arrayClass.add(50.55);
        arrayClass.add(30);
        arrayClass.add(40);*/

        System.out.println(arrayClass);
        kwArraylist arratkw = new kwArraylist();
        System.out.println(arratkw.size());
        System.out.println(arratkw.isEmpty());
        arratkw.add(525);
        arratkw.add(65.55);
        arratkw.add("hi my friend");
        arratkw.add(898);
        System.out.println(arratkw);



    }//main
}//class
