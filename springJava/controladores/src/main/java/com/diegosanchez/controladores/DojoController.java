package com.diegosanchez.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
    @RequestMapping("/{first}")
    public String showMessage(@PathVariable("first") String first){
        if (first.equals("dojo")){
            return "¡El Dojo es increíble!";
        }
        else if (first.equals("burbank-dojo")){
            return "El Dojo Burbank está localizado al sur de California";
        }
        else if (first.equals("san-jose")){
            return "El Dojo SJ es el cuartel general";
        }
        else{
            return "404 Not Found";
        }
    }
}
