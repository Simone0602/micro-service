package com.example.auto.service;

import com.example.auto.model.Auto;
import com.example.auto.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public @ResponseStatus String addAuto(Auto auto){
        Auto aut= autoRepository.save(auto);
        return HttpStatus.OK + "Auto salvata " + aut.toString();
    }

    public List<Auto> getAll() {
        List<Auto> auto = autoRepository.findAll();
        return auto;
    }

    public String delAuto(Long id) {
        if(autoRepository.existsById(id)){
            autoRepository.deleteById(id);
            return "Auto eliminata";
        }else{
            return "Auto non trovata";
        }
    }

    public List<Auto> getAutoProprietarioId(Long proprietario_id) {
        return autoRepository.findByProprietarioId(proprietario_id);
    }
}
