package in.itsp.repo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.itsp.bean.Employee;

@Repository
public class EmployeeRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public String save(Employee emp) {
		 Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
	    int randomInRange = random.nextInt(100);
	    emp.setId(randomInRange);
		int row =jdbcTemplate.update("insert into registry values(?,?,?,?,?,?,?,?,?)",emp.getId(),emp.getName(),emp.getEmail()
							,emp.getPassword(),emp.getGender(),emp.getNote(),emp.isMarried(),emp.getBirthday()
							,emp.getProfession());
		if(row!=0) {
			return "success";
		}else {
			return "failure";
		}
		
	}

}
