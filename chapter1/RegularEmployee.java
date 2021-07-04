package chapter1;
import java.lang.Integer;
//                                   super
public class RegularEmployee extends Employee {
//basicSalary (double), allowances(double), deductions(double) and following methods:

    private double basicSalary,allowances,deductions;

//(i)	Constructor having 8 parameters to initialize all data fields, including that of class Employee,

    public RegularEmployee(String firstName,
                           String lastName,
                           String mobile,
                           char gender,
                           long cpr,
                           double basicSalary,
                           double allowances,
                           double deductions) {

        super(firstName, lastName, mobile, gender, cpr);
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

//(ii)	Set and get methods for all data fields

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

//(iii)	Overridden toString method to return String equivalent of all data fields, including that of class Employee,

    @Override
    public String toString() {
        //Employee.toString()
        return super.toString() +
                " , basicSalary=" + basicSalary +
                ", allowances=" + allowances +
                ", deductions=" + deductions +"\n";
    }


//(iv)	Method monthlySalary that returns the salary as basicSalary + allowances – deductions.

    @Override
    public double monthlySalary() {
        return basicSalary + allowances - deductions;
    }
}
