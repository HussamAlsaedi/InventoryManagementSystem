package com.example.inventorymanagementsystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeID;

    @Column(nullable = false)
    @NotEmpty(message = "name is mandatory")
    @Size(min = 2, message = "name characters must be more then one.")
    private String employeeName;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private MyUser myUser;
}
