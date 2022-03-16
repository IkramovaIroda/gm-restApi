package com.example.gmrestapi.repository;

import com.example.gmrestapi.Autoshop;
import com.example.gmrestapi.Car;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
public interface CARrepository extends JpaRepository<Car,Integer> {


}
