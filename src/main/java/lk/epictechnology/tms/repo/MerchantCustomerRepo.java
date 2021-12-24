package lk.epictechnology.tms.repo;

import lk.epictechnology.tms.entity.merchantcustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */
public interface MerchantCustomerRepo extends JpaRepository<merchantcustomer, String> {

    @Query(value = "select m.IDNO from merchantcustomer m where m.IDNO=?1")
    String getIDNO(String IDNO);

}
