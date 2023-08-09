package Homework3;

public class Data {
    private String lastName;
    private String firstName;
    private String middleName;
    private String date;
    private String phone;
    private String gender;

    public Data() {
    }

    public Data(String[] arr) {
        this.lastName = arr[0];
        this.firstName = arr[1];
        this.middleName = arr[2];
        this.date = arr[3];
        this.phone = arr[4];
        this.gender = arr[5];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + date + ", " + phone + ", " + gender;
    }

}
