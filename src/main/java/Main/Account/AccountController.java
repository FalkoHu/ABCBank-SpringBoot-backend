package Main.Account;

import Main.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/user/{SSN}/account")
    public Account addAccount(@RequestBody Account account, @PathVariable long SSN){
        account.setUser(new User(SSN, "", "", 0, 0, "", "", 0, 0));
        accountRepository.save(account);
        return account;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/user/{SSN}/account")
        public List<Account> getAccountBySSN(@PathVariable long SSN) {
            List<Account> acc = new ArrayList<>();
            accountRepository.findByUserSSN(SSN).forEach(acc :: add);
            return acc;
        }

    @GetMapping(path = "/user/accountAll")
    public List<Account> getAllAccounts(){
        List<Account> acc = new ArrayList<>();
        accountRepository.findAll().forEach(acc :: add);
        return acc;
    }
}