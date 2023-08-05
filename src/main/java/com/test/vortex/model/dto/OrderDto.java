package com.test.vortex.model.dto;

import lombok.Data;

@Data
public class OrderDto {

    private Integer id;
    private String orderType;
    private String address;
    private Integer idDriver;
}
