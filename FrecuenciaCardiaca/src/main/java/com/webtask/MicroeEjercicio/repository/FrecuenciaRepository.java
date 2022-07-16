package com.webtask.MicroeEjercicio.repository;

import com.webtask.MicroeEjercicio.entity.FrecuenciaCardiaca;
import com.webtask.MicroeEjercicio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FrecuenciaRepository extends JpaRepository<FrecuenciaCardiaca,Long> {
    public List<FrecuenciaCardiaca> findByCategory(Usuario user);
}
