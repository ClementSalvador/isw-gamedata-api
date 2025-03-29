package com.ismokewindow.api.gamedata.controller.map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PremiereMapsController {

    @GetMapping(value = "map/premiere")
    public String getPremiereMapPool(){
        return "yes";
    }
}
