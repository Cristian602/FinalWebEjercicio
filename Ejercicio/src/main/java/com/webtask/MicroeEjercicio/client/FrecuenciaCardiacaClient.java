package com.webtask.MicroeEjercicio.client;

import com.webtask.MicroeEjercicio.model.FrecuenciaCardiaca;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "frecuencia-service")
public interface FrecuenciaCardiacaClient {

    @GetMapping(value = "/frecuencias/{id}")
    @CircuitBreaker(name = "frecuenciasIns", fallbackMethod = "getFallbackFrecuencia")
    public ResponseEntity<FrecuenciaCardiaca> getFrecuencia(@PathVariable("id") long id);

    default ResponseEntity<FrecuenciaCardiaca> getFallbackFrecuencia(RuntimeException e) {
        FrecuenciaCardiaca frecuencia = FrecuenciaCardiaca.builder()
                .frecCardiaca(null)
                .build();
        return ResponseEntity.ok(frecuencia);
    }
}
