package Main.Account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer>{
    public List<Account> findByUserSSN(long userSSN);
}
