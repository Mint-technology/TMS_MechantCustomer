package lk.epictechnology.tms.controller;

import lk.epictechnology.tms.dto.testTableDTO;
import lk.epictechnology.tms.dto.usertokensDTO;
import lk.epictechnology.tms.service.testService;
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
@RequestMapping("/test")
@CrossOrigin
public class testController {

    @Autowired
    private testService service;

    @GetMapping
    public String hello(){
        return "helllooooo";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCustomer(@RequestBody usertokensDTO dto) {
        service.addCustomer(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

}
