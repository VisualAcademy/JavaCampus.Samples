package com.hawaso.javacampus.controllers.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecouplingController {
    @Autowired // 필드로 주입
    private DecouplingService svc;
    
    private DecouplingService _service;
    
    @Autowired // 생성자의 매개 변수로 주입 
    public DecouplingController(DecouplingService ds) {
        _service = ds;
    }
    
    @GetMapping("/decoupling")
    public String welcome() {
        return svc.getMessage() + ", " + _service.getMessage();
    }
}

@Service
class DecouplingService {
    public String getMessage() {
        return "디커플링";
    }
}
