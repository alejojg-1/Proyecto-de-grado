package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "CURSO_DOCENTE")
@NoArgsConstructor
public class CursoDocenteEntity {

    @Id
    @Column(name="idcurso_docente")
    private int idCursoDocente;
    @Column(name = "idDocente")
    private int idDocente;
    @Column(name = "idCursos")
    private int idCursos;
    @Column(name = "estado")
    private boolean estado;

}
