package ci.tester.test.repository;

import ci.tester.test.model.Menu;
import ci.tester.test.model.Plat;
import ci.tester.test.service.DTO.PlatDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PlatRepository extends JpaRepository<Plat,Long> {

}
