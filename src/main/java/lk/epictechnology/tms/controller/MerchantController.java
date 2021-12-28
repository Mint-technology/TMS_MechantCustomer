package lk.epictechnology.tms.controller;

import javassist.NotFoundException;
import lk.epictechnology.tms.dto.merchantDTO;
import lk.epictechnology.tms.dto.merchantcustomerDTO;
import lk.epictechnology.tms.service.MerchantCustomerService;
import lk.epictechnology.tms.service.MerchantService;
import lk.epictechnology.tms.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/27/2021
 */

@RestController
@RequestMapping("/merchant")
@CrossOrigin
public class MerchantController {

    @Autowired
    private MerchantService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveMerchant(@RequestBody merchantDTO dto) throws NotFoundException {
        if (dto.getMERCHANTID().trim().length() <= 0) {
            throw new NotFoundException("MERCHANTID cannot be empty");
        }
//        String IDNO=service.getIDNO(dto.getIDNO());
//        if (IDNO == null){
            service.addMerchant(dto);
//        }else if (IDNO.equals(dto.getIDNO())){
//            return new ResponseEntity(new StandardResponse("409", "MerchantCustomer Already Exists", "IDNO : "+dto.getIDNO()), HttpStatus.CREATED);
//        }
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }
}
