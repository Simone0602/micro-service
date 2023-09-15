package com.example.proprietario.controller;

import com.example.proprietario.model.Proprietario;
import com.example.proprietario.service.ProprietarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/proprietario")
public class ProprietarioController {

    Logger logger = LoggerFactory.getLogger(ProprietarioController.class);

    @Autowired
    private ProprietarioService proprietarioService;

    @GetMapping(path = "/proprietari")
    public List<Proprietario> getAll(){
        logger.info("ProprietarioConttroller getAll: IN {}");
        List<Proprietario> prop = proprietarioService.getProprietari();
        logger.info(prop.toString());
        return prop;
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addProprietario(@RequestBody Proprietario proprietario){
        logger.info("ProprietarioConttroller addProprietario: IN {}");
        return proprietarioService.addProprietario(proprietario);
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Proprietario getProprietarioById(@PathVariable(name = "id") Long id){
        logger.info("ProprietarioConttroller getProprietarioById: IN {}");
        return proprietarioService.getProprietarioById(id);
    }

    @DeleteMapping(path = "/del/{id}")
    public @ResponseStatus String delProprietario(@PathVariable(name = "id") Long id){
        return proprietarioService.delProprietarioById(id);
    }
}
