package lk.epictechnology.tms.controller;

import javassist.NotFoundException;
import lk.epictechnology.tms.dto.merchantcustomerDTO;
import lk.epictechnology.tms.service.MerchantCustomerService;
import lk.epictechnology.tms.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

@RestController
@RequestMapping("/merchant")
@CrossOrigin
public class MerchantCustomerController {

    @Autowired
    private MerchantCustomerService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveMerchantCustomer(@RequestBody merchantcustomerDTO dto) throws NotFoundException {
        if (dto.getIDNO().trim().length() <= 0) {
            throw new NotFoundException("IDNO cannot be empty");
        }
        String IDNO=service.getIDNO(dto.getIDNO());
        if (IDNO == null){
            service.addMerchantCustomer(dto);
        }else if (IDNO.equals(dto.getIDNO())){
            return new ResponseEntity(new StandardResponse("409", "MerchantCustomer Already Exists", "IDNO : "+dto.getIDNO()), HttpStatus.CREATED);
        }
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

}
