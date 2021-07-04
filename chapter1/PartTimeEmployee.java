package chapter1;

public class PartTimeEmployee extends Employee {
    // hourlySalary (double), hoursWorked(double) and following methods:
    private double hourlySalary,hoursWorked;
    //(i)	Constructor having 7 parameters to initialize all data fields, including that of class Employee,

    public PartTimeEmployee(String firstName, String lastName, String mobile, char gender,
                            long cpr, double hourlySalary, double hoursWorked) {
        //call Constructor of class Employee
        super(firstName, lastName, mobile, gender, cpr);
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    //(ii)	Set and get methods for all data fields

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //(iii)	Overridden toString method to return String equivalent of all data fields, including that of class Employee,

    @Override
    public String toString() {
        return super.toString()+
                " , hourlySalary=" + hourlySalary +
                ", hoursWorked=" + hoursWorked +"\n" ;
    }

    //(iv)	Method monthlySalary that returns the salary as hourlySalary * hoursWorked.
    @Override
    public double monthlySalary() {
        return hourlySalary * hoursWorked;
    }

}
