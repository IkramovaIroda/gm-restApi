package com.example.gmrestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponce {
    private  String message;
    private  boolean success;
    private  Object object;
    public  ApiResponce(String message, boolean success){
        this.message=message;
        this.success=success;
    }}
