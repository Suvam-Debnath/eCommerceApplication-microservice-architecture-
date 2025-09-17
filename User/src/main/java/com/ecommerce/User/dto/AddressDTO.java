package com.ecommerce.User.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String street;
    private String city;
    private String country;
    private String zipcode;
    private String state;
}
