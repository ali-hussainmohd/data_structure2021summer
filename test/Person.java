/* Students Details :
ID : 20188111
Name : Maher Wael
Activity # : Tutorial #1 Q1
Section # : 1
*/
package test;
public class Person {
    private String firstName,lastName,mobile;
    private char  gender;
    private long cpr;

    public Person(String firstName, String lastName, String mobile, char gender, long cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.gender = gender;
        this.cpr = cpr;
    }

    public Person(String maher, String wael, String mobile, char m, String c) {
    }


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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender=" + gender +
                ", cpr=" + cpr +
                '}';
    }
}
