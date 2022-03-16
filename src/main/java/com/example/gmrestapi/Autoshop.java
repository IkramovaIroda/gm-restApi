package com.example.gmrestapi;

import com.example.gmrestapi.entity.AbsNameEntity;
import com.example.gmrestapi.entity.GM;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Autoshop extends AbsNameEntity {
 @ManyToOne
    private GM gm;
 @OneToOne
 private Address address;

}
