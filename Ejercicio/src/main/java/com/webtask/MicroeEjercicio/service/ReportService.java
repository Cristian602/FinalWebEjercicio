package com.webtask.MicroeEjercicio.service;

import com.webtask.MicroeEjercicio.entity.Reporte;

import java.util.List;

public interface ReportService {
    public List<Reporte> findReporteAll();

    public Reporte createReporte(Reporte invoice);
    public Reporte updateReporte(Reporte invoice);
    public Reporte deleteReporte(Reporte invoice);

    public Reporte getReporte(Long id);
}
