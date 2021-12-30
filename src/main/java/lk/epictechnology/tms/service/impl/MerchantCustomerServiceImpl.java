package lk.epictechnology.tms.service.impl;

import lk.epictechnology.tms.dto.merchantcustomerDTO;
import lk.epictechnology.tms.entity.merchantcustomer;
import lk.epictechnology.tms.repo.MerchantCustomerRepo;
import lk.epictechnology.tms.service.MerchantCustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

@Service
@Transactional
public class MerchantCustomerServiceImpl implements MerchantCustomerService {

    @Autowired
    private MerchantCustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addMerchantCustomer(merchantcustomerDTO dto) {
        repo.save(mapper.map(dto, merchantcustomer.class));
    }

    @Override
    public String getIDNO(String IDNO) {
        return repo.getIDNO(IDNO);
    }
}
