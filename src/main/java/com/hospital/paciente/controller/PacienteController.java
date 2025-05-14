package com.hospital.paciente.controller;

import com.hospital.paciente.model.Paciente;
import com.hospital.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    public PacienteService pacienteService;

    @GetMapping("/api/v1/pacientes")
    public ResponseEntity<?> obtenerPaciente() {
        List<Paciente> pacientes = pacienteService.findAll();
        return ResponseEntity.ok().body(pacientes);
    }
}
