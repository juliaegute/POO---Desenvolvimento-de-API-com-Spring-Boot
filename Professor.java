package org.example.projetospringdata.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Usuario {

    @Column(nullable = false)
    private String area;

    public Professor() {
    }

    public Professor(String nome, String email, String area) {
        super(nome, email);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}