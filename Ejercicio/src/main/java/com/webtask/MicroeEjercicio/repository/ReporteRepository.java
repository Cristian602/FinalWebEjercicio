package com.webtask.MicroeEjercicio.repository;

import com.webtask.MicroeEjercicio.entity.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
    public Reporte findByNumberReporte(String codigoReporte);
}
