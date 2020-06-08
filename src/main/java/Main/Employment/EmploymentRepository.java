package Main.Employment;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploymentRepository extends JpaRepository<Employment, Integer>{
    public List<Employment> findByUserSSN(long userSSN);
}
