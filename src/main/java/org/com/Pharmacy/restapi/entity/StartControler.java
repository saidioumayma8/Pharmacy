package org.com.Pharmacy.restapi.entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class StartControler {

    @GetMapping("/Date")
    public LocalDate getdate(){
        return LocalDate.now();
    }
}
