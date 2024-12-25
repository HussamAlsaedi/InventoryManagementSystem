package com.example.inventorymanagementsystem.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    @Column(nullable = false)
    @NotEmpty(message = "supplierName is mandatory.")
    private String supplierName;

    @OneToOne(mappedBy = "supplier", cascade = CascadeType.ALL)
     private Profile profile;
}
