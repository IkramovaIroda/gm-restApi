package com.example.gmrestapi.dto;

import com.example.gmrestapi.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GMdto {
    public String city;
    private  String corpname;
    private String director;
    private Address adress;
    public String home;
    public String street;
}
