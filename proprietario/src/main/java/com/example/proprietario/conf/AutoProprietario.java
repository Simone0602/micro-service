package com.example.proprietario.conf;

import com.example.proprietario.dto.AutoDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "proprietario_ms",
        url="${auto.service.base.url}"
)
public interface AutoProprietario {

    @GetMapping("${auto.service.get.by.proprietario.id.url}")
    public List<AutoDto> getAutoByProprietarioId(@PathVariable Long proprietario_id);
}
