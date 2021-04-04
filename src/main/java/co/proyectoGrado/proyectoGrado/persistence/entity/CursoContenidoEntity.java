package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "CURSO_CONTENIDO")
@NoArgsConstructor
public class CursoContenidoEntity {

    @Id
    @Column(name = "idCurso_contenido")
    private int idCursoContenido;
    @Column(name = "idCategoria_contenido")
    private int idCategoriaContenido;
    @ManyToOne
    @JoinColumn(name="idCursos", insertable = false, updatable = false)
    private CursoEntitiy curso;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "video")
    private String video;

}
