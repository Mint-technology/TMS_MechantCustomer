package lk.epictechnology.tms.service.impl;

import lk.epictechnology.tms.dto.merchantDTO;
import lk.epictechnology.tms.entity.merchant;
import lk.epictechnology.tms.entity.merchantcustomer;
import lk.epictechnology.tms.repo.MerchantCustomerRepo;
import lk.epictechnology.tms.repo.MerchantRepo;
import lk.epictechnology.tms.service.MerchantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/27/2021
 */
@Service
@Transactional
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addMerchant(merchantDTO dto) {
        repo.save(mapper.map(dto, merchant.class));
    }
}
