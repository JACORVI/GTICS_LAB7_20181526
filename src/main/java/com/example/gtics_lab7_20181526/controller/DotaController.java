package com.example.gtics_lab7_20181526.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DotaController {
public DotaController(){

}
    @GetMapping(value = "/DotaInicio")
    public String DotaInicio(Model model){
    model.addAttribute("mmr");
    list<mmr>;
    return "DotaInicio";
    }
}
