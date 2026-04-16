package org.example.projetospringdata.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador extends Usuario {

    @Column(nullable = false)
    private String nivelAcesso;

    public Administrador() {
    }

    public Administrador(String nome, String email, String nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}