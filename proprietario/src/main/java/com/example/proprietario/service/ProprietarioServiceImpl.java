package com.example.proprietario.service;

import com.example.proprietario.conf.AppConf;
import com.example.proprietario.conf.AutoProprietario;
import com.example.proprietario.dto.AutoDto;
import com.example.proprietario.model.Proprietario;
import com.example.proprietario.repository.ProprietarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioServiceImpl {

    @Autowired
    private AutoProprietario autoProprietario;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @Override
    public List<AutoDto> getAutoByProprietarioId(@PathVariable Long proprietario_id){
        List<AutoDto> autoProprietario = new ArrayList<>();
        Optional<Proprietario> proprietario;

        if(proprietarioRepository.existsById(proprietario_id)){
            proprietario = proprietarioRepository.findById(proprietario_id);
        }


    }
}
