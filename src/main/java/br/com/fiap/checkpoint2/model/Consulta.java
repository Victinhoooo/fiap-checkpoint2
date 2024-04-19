package br.com.fiap.checkpoint2.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

    @Entity
    @Table(name = "consultas")
    public class Consulta  extends AbstractEntity<Long> {

        @ManyToOne(optional = false)
        @JoinColumn(name = "profissional_id", nullable = false)
        private Profissional  profissional;

        @ManyToOne(optional = false)
        @JoinColumn(name = "paciente_id", nullable = false)
        private Paciente  paciente;

        @Column(name = "data_consulta", nullable = false, columnDefinition = "DATETIME")
        private LocalDateTime dataConsulta;

        public Profissional getProfissional() {
            return profissional;
        }

        public void setProfissional(Profissional profissional) {
            this.profissional = profissional;
        }

        public Paciente  getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public LocalDateTime getDataConsulta() {
            return dataConsulta;
        }

        public void setDataConsulta(LocalDateTime dataConsulta) {
            this.dataConsulta = dataConsulta;
        }

        public StatusConsulta getStatusConsulta() {
            return statusConsulta;
        }

        public void setStatusConsulta(StatusConsulta statusConsulta) {
            this.statusConsulta = statusConsulta;
        }

        public Integer getQuantidadeHoras() {
            return quantidadeHoras;
        }

        public void setQuantidadeHoras(Integer quantidadeHoras) {
            this.quantidadeHoras = quantidadeHoras;
        }

        public Double getValorConsulta() {
            return valorConsulta;
        }

        public void setValorConsulta(Double valorConsulta) {
            this.valorConsulta = valorConsulta;
        }

        @Enumerated(EnumType.STRING)
        @Column(name = "status_consulta", nullable = false)
        private StatusConsulta statusConsulta;

        @Column(name = "quantidade_horas")
        private Integer quantidadeHoras;

        @Column(name = "valor_consulta")
        private Double valorConsulta;

    }
