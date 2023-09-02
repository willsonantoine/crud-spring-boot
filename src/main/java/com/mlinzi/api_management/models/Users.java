package com.mlinzi.api_management.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(length = 250)
    private String name;
    @Column(length = 250)
    private String password;
    @Column(length = 500)
    private String phone;
    private boolean status;
    @Column(length = 500)
    private String observation;
    @Column(length = 250)
    private String fullname;

}
