package lk.epictechnology.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 12/23/2021
 */

@RestController
@RequestMapping("/test")
@CrossOrigin
public class testController {


    @GetMapping
    public String hello(){
        return "helllooooo";
    }


}
