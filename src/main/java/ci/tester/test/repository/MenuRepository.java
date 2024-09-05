package ci.tester.test.repository;

import ci.tester.test.model.Menu;
import ci.tester.test.model.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MenuRepository extends JpaRepository<Menu, Long> {
}
