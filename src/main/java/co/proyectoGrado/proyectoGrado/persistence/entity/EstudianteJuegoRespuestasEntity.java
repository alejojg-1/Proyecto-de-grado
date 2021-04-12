package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table( name = "ESTUDIANTE_JUEGO_RESPUESTA")
@NoArgsConstructor
public class EstudianteJuegoRespuestasEntity {

    @Id
    @Column(name= "idEstudiante_juego_respuestas")
    private int idEstudianteJuegoRespuestas;
    @OneToOne
    @JoinColumn(name="idJuego_preguntas", insertable = false, updatable = false)
    private JuegoPreguntasEntity juegoPregunta;
    @Column(name= "idPreguntas")
    private int idpreguntas;
    @Column(name= "idReto")
    private int idReto;

    @OneToOne(mappedBy = "estudianteJuegoRespuesta")
    private EstudianteJuegoEntity estudianteJuego;


}
