package com.webtask.MicroeEjercicio.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tlb_reportes")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NUMBERREPORTE")
    private String numberReporte;

    @Column(name = "USERID")
    private Long userId;

    //se recupera de aracely
    private Long presionDiastolica;
    private Long presionAsistolica;

    //eso medimos nosotros
    private Long frecCardiaca;

    private Long duracion;
    private Long calorias;

}
