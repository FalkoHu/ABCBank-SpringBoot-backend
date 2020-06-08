package Main.Account;

import Main.User.User;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accId;

    @ManyToOne
    private User user;

    private String type;
    private int fundigAmount;

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFundigAmount() {
        return fundigAmount;
    }

    public void setFundigAmount(int fundigAmount) {
        this.fundigAmount = fundigAmount;
    }
}
