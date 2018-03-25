package com.students.management.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/hal+json")
    public String testconfigList() {
        return "welcome to student mgt";
    }


}
