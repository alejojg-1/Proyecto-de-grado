package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "ESTUDIANTE_JUEGO_RESPUESTA")
@NoArgsConstructor
public class EstudianteJuegoRespuestasEntity {

    @Id
    @Column(name= "idEstudiante_juego_respuestas")
    private int idEstudianteJuegoRespuestas;
    @Column(name= "idjuego_preguntas")
    private int idjuegoPreguntas;
    @Column(name= "idPreguntas")
    private int idpreguntas;
    @Column(name= "idReto")
    private int idReto;



}
