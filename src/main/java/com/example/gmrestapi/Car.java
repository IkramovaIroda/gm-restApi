package com.example.gmrestapi;

import com.example.gmrestapi.entity.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car extends AbsEntity {
    private String model;
    private  int year;
    private  double price;
}
