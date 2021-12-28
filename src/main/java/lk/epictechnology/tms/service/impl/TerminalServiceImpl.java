package lk.epictechnology.tms.service.impl;

import lk.epictechnology.tms.dto.terminalDTO;
import lk.epictechnology.tms.entity.merchant;
import lk.epictechnology.tms.entity.terminal;
import lk.epictechnology.tms.repo.MerchantRepo;
import lk.epictechnology.tms.repo.TerminalRepo;
import lk.epictechnology.tms.service.TerminalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */

@Service
@Transactional
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addTerminal(terminalDTO dto) {
        repo.save(mapper.map(dto, terminal.class));
    }
}
