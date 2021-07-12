import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveRetornarEscolaridadeCoordenadorDeUmCurso(){
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Curso curso = new Curso();

        escolaridade.setNivelEscolaridade("Mestrado");
        coordenador.setEscolaridade(escolaridade);
        curso.setProfessor(coordenador);

        assertEquals("Mestrado", curso.getProfessor().getEscolaridadeProfessor());
    }
}