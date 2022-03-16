package com.example.gmrestapi.entity;

import com.example.gmrestapi.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GM {
    private String corpName;
    private String director;
    @OneToOne
    private Address address;
}
