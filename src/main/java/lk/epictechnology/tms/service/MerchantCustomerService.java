package lk.epictechnology.tms.service;

import lk.epictechnology.tms.dto.merchantcustomerDTO;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */
public interface MerchantCustomerService {

    void addMerchantCustomer(merchantcustomerDTO dto);

    String getIDNO(String IDNO);
}
