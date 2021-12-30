package lk.epictechnology.tms.repo;

import lk.epictechnology.tms.entity.merchantcustomer;
import lk.epictechnology.tms.entity.terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */
public interface TerminalRepo extends JpaRepository<terminal, String> {

    @Query(value = "select t.TERMINALID from terminal t where t.TERMINALID=?1")
    String getTERMINALID(String TERMINALID);

}
