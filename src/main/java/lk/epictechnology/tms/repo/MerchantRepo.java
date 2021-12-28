package lk.epictechnology.tms.repo;

import lk.epictechnology.tms.entity.merchant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/27/2021
 */
public interface MerchantRepo extends JpaRepository<merchant, String> {
}
