package com.ar.spring.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/homepage")
public class HelloController {
    @GetMapping("/getInfo")
    public String getUserInfo() {

        return "Hello World";
    }

    @GetMapping("/Getusername/{name}")
    public String getUsername(@PathVariable(value = "name") String n) {
        return "Hai" + n;
    }

    @GetMapping("/Getusername/{name}/{address}")
    public String getusernameandAddress(@PathVariable(value = "name") String n,
                                        @PathVariable(value = "address") String a) {
        return "Hai" + n + "from" + a + "Welcome";
    }
}






