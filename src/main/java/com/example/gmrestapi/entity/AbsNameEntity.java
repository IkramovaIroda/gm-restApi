package com.example.gmrestapi.entity;

import com.example.gmrestapi.Address;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class AbsNameEntity {
@Id
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID code;
    private boolean active=true;
@CreationTimestamp
    @Column(nullable = false,updatable = false)
    private Timestamp created;
@UpdateTimestamp
@Column(nullable = false);
private Timestamp updatedA;
}
