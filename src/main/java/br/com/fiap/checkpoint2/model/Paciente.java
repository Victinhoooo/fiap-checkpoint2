package br.com.fiap.checkpoint2.model;


package br.com.fiap.checkpoint2.model;

        import jakarta.persistence.Column;
        import jakarta.persistence.Entity;
        import jakarta.persistence.Table;

        import java.time.LocalDate;
        import java.time.LocalDateTime;
        import java.util.Date;


@Entity
@Table (name = "pacientes")
public class Paciente extends AbstractEntity<Long>{



    @Column(nullable = false, length = 40, unique = true)
    private String nome;

    @Column(  length = 40)
    private String endereco;

    @Column( length = 40)
    private String bairro;

    @Column( length = 40)
    private String email;

    @Column(length = 40 )
    private String telefone_completo;

    @Column(nullable = false, length = 40, unique = true)
    private LocalDate data_nascimento;

    @Column(nullable = false, length = 40, unique = true)
    private LocalDateTime cretated_at;

    @Column(nullable = false, length = 40, unique = true)
    private Date updated_at;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone_completo(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setCretated_at(LocalDateTime cretated_at) {
        this.cretated_at = cretated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone_completo() {
        return telefone_completo;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public LocalDateTime getCretated_at() {
        return cretated_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public String getNome() {
        return nome;
    }
}
