package com.test.vortex.model.dto;

import lombok.Data;

@Data
public class DriverDto {

    private Integer id;
    private String identification;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String address;
}
