package Main.User;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private long SSN;

    private String fName;

    private String lName;

    private int dob;

    private long phoneNumber;

    private String email;

    private String beneficiaryName;

    private long beneficiarySSN;

    private int beneficiaryDOB;

    public User(){

    }
    public User(long SSN){
        this.SSN = SSN;
    }
    public User(long SSN, String fName, String lName, int dob, long phoneNumber, String email, String beneficiaryName, long beneficiarySSN, int beneficiaryDOB) {
        this.SSN = SSN;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.beneficiaryName = beneficiaryName;
        this.beneficiarySSN = beneficiarySSN;
        this.beneficiaryDOB = beneficiaryDOB;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getBeneficiarySSN() {
        return beneficiarySSN;
    }

    public void setBeneficiarySSN(long beneficiarySSN) {
        this.beneficiarySSN = beneficiarySSN;
    }

    public int getBeneficiaryDOB() {
        return beneficiaryDOB;
    }

    public void setBeneficiaryDOB(int beneficiaryDOB) {
        this.beneficiaryDOB = beneficiaryDOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }
}