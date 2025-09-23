package com.ecommerce.User.models;

import lombok.Data;

@Data

public class Address {

    private Long id;
    private String street;
    private String city;
    private String country;
    private String zipcode;
    private String state;
}
