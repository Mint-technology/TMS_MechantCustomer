package lk.epictechnology.tms.controller;

import javassist.NotFoundException;
import lk.epictechnology.tms.dto.merchantDTO;
import lk.epictechnology.tms.dto.terminalDTO;
import lk.epictechnology.tms.service.MerchantCustomerService;
import lk.epictechnology.tms.service.TerminalService;
import lk.epictechnology.tms.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/28/2021
 */

@RestController
@RequestMapping("/terminal")
@CrossOrigin
public class TerminalController {

    @Autowired
    private TerminalService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveTerminal(@RequestBody terminalDTO dto) throws NotFoundException {

        if (dto.getTERMINALID().trim().length() <= 0) {
            throw new NotFoundException("TERMINALID cannot be empty");
        }
        String TERMINALID=service.getTerminalID(dto.getTERMINALID());
        if (TERMINALID == null){
            service.addTerminal(dto);
        }else if (TERMINALID.equals(dto.getTERMINALID())){
            return new ResponseEntity(new StandardResponse("409", "TERMINALID Already Exists", "TERMINALID : "+dto.getTERMINALID()), HttpStatus.CREATED);
        };
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

}
