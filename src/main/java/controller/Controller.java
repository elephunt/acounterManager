package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by roman on 10/07/17.
 */
@RestController("/stats")
public class Controller {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String getAllData() {
        return "WZUPP";
    }
}
