package Main.Employment;

import Main.User.User;

import javax.persistence.*;

@Entity
public class Employment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    @ManyToOne()
    private User user;

    private String name;
    private String address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
