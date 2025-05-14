package com.hospital.paciente.model;


import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = false, length = 100)
    public String nombre;

    @Column(nullable = false, unique = false, length = 100)
    public String apellido;

    @Column(nullable = false, unique = true, length = 100)
    public String correo;

    @Column(nullable = false, unique = false)
    public Date fechaNacimiento;
}