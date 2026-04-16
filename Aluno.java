package org.example.projetospringdata.Dominio;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno extends Usuario {

    @Column(nullable = false, unique = true)
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}