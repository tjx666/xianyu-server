package com.example.xianyuserver.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserController {
    @RequestMapping(value = "", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public String getUsers() {
        return "[\n" +
                "  {\n" +
                "    \"name\": \"ly\",\n" +
                "    \"age\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"lyr\",\n" +
                "    \"age\": 20\n" +
                "  }\n" +
                "]";
    }

//    @RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
//    public String registerUser() {
//
//    }


}
