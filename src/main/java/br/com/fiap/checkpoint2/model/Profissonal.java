package br.com.fiap.checkpoint2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigInteger;
import java.time.LocalDateTime;



@Entity
@Table(name = "proficionais")
public class Profissonal extends AbstractEntity<Long> {



    @Column(nullable = false, length = 40, unique = true)
    private String nome;

    @Column(nullable = false, length = 40, unique = true)
    private String especialidade;

    @Column( length = 40 )
    private BigInteger valor_hora;

    @Column(nullable = false, length = 40, unique = true)
    private LocalDateTime creted_at;

    @Column(nullable = false, length = 40, unique = true)
    private LocalDateTime updated_at;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public BigInteger getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(BigInteger valor_hora) {
        this.valor_hora = valor_hora;
    }

    public LocalDateTime getCreted_at() {
        return creted_at;
    }

    public void setCreted_at(LocalDateTime creted_at) {
        this.creted_at = creted_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }



}
