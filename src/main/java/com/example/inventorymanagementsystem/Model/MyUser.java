package com.example.inventorymanagementsystem.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileID;

    @Column(unique = false, nullable = false)
    @NotEmpty(message = "username is mandatory")
    @Size(min = 3,message = "username characters must be more then 2")
    private String username;

    @Column(unique = false, nullable = false)
    @NotEmpty(message = "username is mandatory")
    @Size(min = 3,message = "username characters must be more then 2")
    private String password;

    @Column(unique = false, nullable = false)
    @NotEmpty(message = "email is mandatory")
    @Email(message = "email that entered not valid")
    private String email;

    @Column(unique = false, nullable = false,length = 10)
    @NotEmpty(message = "username is mandatory")
    @Size(min = 10,max = 10, message = "phone numbers must 10 characters")
    private String phone;

    @Column(unique = false, nullable = false)
    @NotEmpty(message = "country is mandatory")
    @Size(min = 3,message = "country characters must be more then 2")
    private String country;

    @Column(unique = false, nullable = false)
    @NotEmpty(message = "url is mandatory")
    @Size(min = 3,message = "url characters must be more then 2")
    private String url;


    @OneToOne
    private Employee employee;

    @OneToOne
    private Supplier supplier;
}

