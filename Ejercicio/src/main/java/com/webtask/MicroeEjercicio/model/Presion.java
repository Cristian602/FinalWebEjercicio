package com.webtask.MicroeEjercicio.model;

import lombok.Builder;
import lombok.Data;

@Data
public class Presion {
    private Long id;

    private Long presionAsistolica;

    private Long presionDiastolica;

}
