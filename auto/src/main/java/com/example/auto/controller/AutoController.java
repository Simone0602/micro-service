package com.example.auto.controller;

import com.example.auto.model.Auto;
import com.example.auto.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/auto")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @PostMapping
    public @ResponseStatus String addAuto(@RequestBody Auto auto){
        return autoService.addAuto(auto);
    }

    @GetMapping(path = "/get")
    public List<Auto> getAllAuto(){
        return autoService.getAll();
    }

    @GetMapping(path = "/del/{id}")
    public String delAutoById(@PathVariable(name = "id") Long id){
        return autoService.delAuto(id);
    }

    @GetMapping(path = "/proprietario/{proprietario_id}")
    public List<Auto> getAutoByProprietarioId(@PathVariable(name = "proprietario_id") Long proprietario_id){
        return autoService.getAutoProprietarioId(proprietario_id);
    }
}
