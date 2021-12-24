package lk.epictechnology.tms.repo;

import lk.epictechnology.tms.entity.testTable;
import lk.epictechnology.tms.entity.usertokens;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */
public interface testRepo1 extends JpaRepository<testTable, String> {
}
