package lk.epictechnology.tms.service.impl;

import lk.epictechnology.tms.dto.testTableDTO;
import lk.epictechnology.tms.dto.usertokensDTO;
import lk.epictechnology.tms.entity.testTable;
import lk.epictechnology.tms.entity.usertokens;
import lk.epictechnology.tms.repo.testRepo;
import lk.epictechnology.tms.service.testService;
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
public class testServiceImpl implements testService {

    @Autowired
    private testRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addCustomer(usertokensDTO test) {
        repo.save(mapper.map(test, usertokens.class));
    }
}
