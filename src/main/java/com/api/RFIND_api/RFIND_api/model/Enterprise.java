package com.api.RFIND_api.RFIND_api.model;

import com.api.RFIND_api.RFIND_api.DTO.Request.EnterpriseRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "enterprise")
@Getter
@AllArgsConstructor @NoArgsConstructor
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true, length = 14)
    private int cnpj;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 6)
    private String password;

    public Enterprise(EnterpriseRequest request){
        this(request.id(), request.cnpj(), request.name(), request.email(), request.password());
    }
}
