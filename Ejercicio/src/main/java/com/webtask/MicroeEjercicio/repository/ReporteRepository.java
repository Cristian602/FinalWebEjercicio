package com.webtask.MicroeEjercicio.repository;

import com.webtask.MicroeEjercicio.entity.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
    public List<Reporte> findByUserId(Long userId);

}
