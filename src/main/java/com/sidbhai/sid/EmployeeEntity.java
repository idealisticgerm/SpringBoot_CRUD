package com.sidbhai.sid;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "emp")

public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String phone;
    private String email;
}
