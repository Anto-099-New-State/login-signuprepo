package com.maven.newbie;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
    @GetMapping("/home")
    public String spi() {
        return "################################BenStokes###########################################";
    }

}
