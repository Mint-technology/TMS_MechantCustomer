package lk.epictechnology.tms.repo;

import lk.epictechnology.tms.entity.merchantcustomer;
import lk.epictechnology.tms.entity.terminal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */
public interface TerminalRepo extends JpaRepository<terminal, String> {
}
