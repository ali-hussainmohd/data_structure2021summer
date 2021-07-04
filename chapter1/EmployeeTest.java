package chapter1;

public class EmployeeTest {
    public static void main(String[] args) {
        //object
        // copy of the class with value
    RegularEmployee e1 = new RegularEmployee("ali","hussain",
            "353",'m',356,500,200,20);
    PartTimeEmployee e2 = new PartTimeEmployee("Ahmed","Khalil","665"
            ,'M',665,10,160);
    // e1.toString()
        System.out.println(e1);
        System.out.println("e1 salary = "+e1.monthlySalary());
        System.out.println(e2);
        System.out.println("e2 salary = "+e2.monthlySalary());



    }//main
}//class
