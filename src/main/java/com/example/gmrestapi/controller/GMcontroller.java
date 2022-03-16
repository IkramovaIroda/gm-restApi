package com.example.gmrestapi.controller;

import com.example.gmrestapi.dto.ApiResponce;
import com.example.gmrestapi.dto.GMdto;
import com.example.gmrestapi.entity.GM;
import com.example.gmrestapi.repository.CARrepository;
import com.example.gmrestapi.repository.GMrepository;
import com.example.gmrestapi.service.GMService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/gm")
@RequiredArgsConstructor
public class GMcontroller {
    final GMrepository gMrepository;
    final CARrepository caRrepository;
    final GMService gmService;
    @GetMapping
    public HttpEntity<?>getAll(){
        List<GM> all=gMrepository.findAll();
        return ResponseEntity.ok().body(all);
    }
    @GetMapping("/{id")
    public HttpEntity<?>  getOne(@PathVariable Integer id){
        Optional<GM> byId=gMrepository.findById(id);

        return ResponseEntity.status(byId.isEmpty()? 404:200).body(byId.orElse(new GM()));


    }
    @PostMapping
public HttpEntity<?> add(@RequestBody GMdto dto ){
        ApiResponce responce = gmService.add(dto);
        return ResponseEntity.status(responce.isSuccess() ? 201:400).body(responce);
    }

@PutMapping("/{id")
public  HttpEntity<?>edit(@PathVariable Integer id ,@RequestBody GMdto gMdto){
        ApiResponce responce = gmService.edit(id,gMdto);
        return  ResponseEntity.status(responce.isSuccess() ? 200:409).body(responce);
}
@DeleteMapping("/{id}")
    public  HttpEntity<?> delete(@PathVariable Integer id){
//        if (gMrepository.existsById(id)){
//            gMrepository.deleteById(id);
//            return  ResponseEntity.ok().body("deleted");
//        }else {
//            return  ResponseEntity.status(404).body("GM not found");
//        }
    Optional <GM> byId=gMrepository.findById(id);
    if (byId.isEmpty())return ResponseEntity.status(404).body("not found")
    GM gm = byId.get();
    gMrepository.save(gm);
    return  ResponseEntity.ok().body("Deleted");
}
}
