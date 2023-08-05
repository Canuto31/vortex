package com.test.vortex.model.dto;

import lombok.Data;

@Data
public class VehicleDto {

    private Integer id;
    private String model;
    private String plate;
    private String capacity;
    private Integer idDriver;
}
