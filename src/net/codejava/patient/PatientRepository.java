package net.codejava.patient;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface PatientRepository extends CrudRepository<Patient, Long> {
     
    @Query(value = "SELECT c FROM patient c WHERE c.firstname LIKE '%' || :keyword || '%'"
            + " OR c.lastname LIKE '%' || :keyword || '%'"
            + " OR c.dob LIKE '%' || :keyword || '%'"
            + " OR c.email LIKE '%' || :keyword || '%'"
            + " OR c.password LIKE '%' || :keyword || '%'")
    public List<Patient> search(@Param("keyword") String keyword);
}

