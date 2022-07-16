package com.webtask.MicroeEjercicio.service;

import com.webtask.MicroeEjercicio.entity.FrecuenciaCardiaca;
import com.webtask.MicroeEjercicio.entity.Usuario;

import java.util.List;

public interface FrecuenciaService {
    public List<FrecuenciaCardiaca> listAllFrecuencias();
    public FrecuenciaCardiaca getFrecuencia(Long id);

    public FrecuenciaCardiaca saveFrecuencia(FrecuenciaCardiaca frecuencia);
    public FrecuenciaCardiaca updateFrecuencia(FrecuenciaCardiaca frecuencia);
    public  FrecuenciaCardiaca deleteFrecuencia(Long id);
    public List<FrecuenciaCardiaca> findByUser(Usuario user);
    public FrecuenciaCardiaca calcularAlgo(Long id, Double quantity);
}
