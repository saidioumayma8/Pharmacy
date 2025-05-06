package org.oum.pharmacy.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomaController {

    @RequestMapping("/")
    public String index(){
        String ViewName = getViewName();
        return ViewName;
    }
    private String getViewName(){
        return "index.html";
    }
}
