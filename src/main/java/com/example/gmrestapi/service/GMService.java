package com.example.gmrestapi.service;

import com.example.gmrestapi.Address;
import com.example.gmrestapi.dto.ApiResponce;
import com.example.gmrestapi.dto.GMdto;
import com.example.gmrestapi.entity.GM;
import com.example.gmrestapi.repository.AddressRepository;
import com.example.gmrestapi.repository.GMrepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class GMService {
    AddressRepository addressRepository;
    GMrepository gMrepository;

    public ApiResponce add(GMdto dto) {
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setHome(dto.getHome());
        address.setStreet(dto.getStreet());
        Address save = addressRepository.save(address);
        GM gm = new GM();
        gm.setDirector(dto.getDirector());
        gm.setCorpName(dto.getCorpname());
        gm.setAddress(save);
        gMrepository.save(gm);
        return new ApiResponce("Added", true);
    }

    public ApiResponce edit(Integer id, GMdto dto) {
      Optional<GM> byId= gMrepository.findById(id);
      if (byId.isEmpty())return  new ApiResponce("GM not found",false);
      GM gm = byId.get();
      gm.setDirector(dto.getDirector());
      gm.setCorpName(dto.getCorpname());
      Address gmAddress = gm.getAddress();
      gmAddress.setStreet(dto.getStreet());
      gmAddress.setCity(dto.getCity());
      gmAddress.setHome(dto.getHome());
      gm.setAddress(gmAddress);
      gMrepository.save(gm);
        return  new ApiResponce("Edited",true);
    }
}