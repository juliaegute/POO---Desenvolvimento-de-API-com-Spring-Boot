package dominio.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Classe de dominio anotada como Entity.
 *
 * Versao basica da matricula, sem relacionamentos JPA.
 */
@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long alunoId;

    @Column(nullable = false)
    private Long cursoId;

    @Column(nullable = false)
    private LocalDate dataMatricula;

    public Matricula() {
        // Construtor padrao exigido pela JPA.
    }

    public Matricula(Long alunoId, Long cursoId, LocalDate dataMatricula) {
        this.alunoId = alunoId;
        this.cursoId = cursoId;
        this.dataMatricula = dataMatricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}   