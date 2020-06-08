package Main.Employment;

import Main.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmploymentController {

    @Autowired
    EmploymentRepository employmentRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/user/{SSN}/employment")
    public Employment addEmployement(@RequestBody Employment employment, @PathVariable long SSN){
        employment.setUser(new User(SSN));
        employmentRepository.save(employment);
        return employment;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/user/{SSN}/employment")
    public List<Employment> getEmploymentBySSN(@PathVariable long SSN){
        List<Employment> emp = new ArrayList<>();
        employmentRepository.findByUserSSN(SSN).forEach(emp :: add);
        return emp;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/user/employmentAll")
    public List<Employment> getAllEmployment(){
        List<Employment> emp = new ArrayList<>();
        employmentRepository.findAll().forEach(emp :: add);
        return emp;
    }
}
