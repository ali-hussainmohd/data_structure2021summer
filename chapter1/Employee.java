package chapter1;


abstract public class Employee {
    //firstName (String), lastName(String), gender(char), cpr(long), mobile(String) and following methods:
    private String firstName,lastName,mobile;
    private char gender;
    private long cpr;

    //(i)	Constructor having 5 parameters to initialize all data fields,
    public Employee(String firstName, String lastName, String mobile, char gender, long cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.gender = gender;
        this.cpr = cpr;
    }

    //(ii)	Set and get methods for all data fields,

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getCpr() {
        return cpr;
    }

    public void setCpr(long cpr) {
        this.cpr = cpr;
    }

    //(iii)	toString method to return String equivalent of all data fields,
    //firstName (String), lastName(String), gender(char), cpr(long), mobile(String) and following methods:

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender=" + gender +
                ", cpr=" + cpr ;
    }


    //(iv)	Abstract method monthlySalary.

     public abstract double monthlySalary();

}
