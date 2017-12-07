package com.eason.springmvcdemo.Springmvc.DateAndTimeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by easonjackson on 6/16/17.
 */

@Controller
public class ServiceController {

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    public String getDate() {
        //return new Date().toString();
        return "greeting";
    }

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getTime() {
        return Long.toString(new Date().getTime());
    }
}
