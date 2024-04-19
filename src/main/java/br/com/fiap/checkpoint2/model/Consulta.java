package br.com.fiap.checkpoint2.model;


import jakarta.persistence.*;

@Entity
@Table(name = "consultas")
public class Consulta extends<Long> {

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "data_consulta", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime dataConsulta;



}
