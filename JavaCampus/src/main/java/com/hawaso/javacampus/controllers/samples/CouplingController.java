package com.hawaso.javacampus.controllers.samples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouplingController {
    private CouplingService svc = new CouplingService(); 
    
    @GetMapping("/coupling")
    public String welcome() {
        return svc.getMessage();
    }
}

class CouplingService {
    public String getMessage() {
        return "커플링";
    }
}
