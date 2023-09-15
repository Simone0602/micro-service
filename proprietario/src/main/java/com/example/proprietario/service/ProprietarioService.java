package com.example.proprietario.service;

import com.example.proprietario.controller.ProprietarioController;
import com.example.proprietario.model.Proprietario;
import com.example.proprietario.repository.ProprietarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class ProprietarioService {
    Logger logger = LoggerFactory.getLogger(ProprietarioService.class);

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public List<Proprietario> getProprietari() {
        logger.info("ProprietarioService getProprietari: IN {}");
        List<Proprietario> prop =proprietarioRepository.findAll();
        logger.info(prop.toString());
        return prop;
    }

    public String addProprietario(Proprietario proprietario) {
        logger.info("ProprietarioService addProprietario: IN {}");
        Proprietario prop = proprietarioRepository.save(proprietario);
        return "Proprietario salvato: " + prop.toString();
    }

    public @ResponseBody Proprietario getProprietarioById(Long id) {
        logger.info("ProprietarioService getProprietario: IN {}");
        return proprietarioRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proprietario non trovato")
        );
    }

    public @ResponseStatus String delProprietarioById(Long id){
        if(proprietarioRepository.existsById(id)){
            proprietarioRepository.deleteById(id);
            return HttpStatus.OK + "Proprietario eliminato";
        }else {
            return HttpStatus.NOT_FOUND + "Proprietario non trovato";
        }
    }
}
