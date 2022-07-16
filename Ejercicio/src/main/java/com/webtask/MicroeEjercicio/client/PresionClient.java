package com.webtask.MicroeEjercicio.client;

import com.webtask.MicroeEjercicio.model.Presion;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "presion-service", path = "/presiones")

public interface PresionClient {

    @GetMapping(value = "/{id}")
    @CircuitBreaker(name = "presionIns", fallbackMethod = "getFallbackPresion")
    public ResponseEntity<Presion> getPresion(@PathVariable("id") Long id);
    default ResponseEntity<Presion> getFallbackPresion(RuntimeException e) {
        return ResponseEntity.ok(null);
    }
}
