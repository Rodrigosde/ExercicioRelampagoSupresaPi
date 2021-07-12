import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno(){
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();

        cidade.setNome("Sao Joao Nepomuceno");
        aluno.setCidade(cidade);

        assertEquals("Sao Joao Nepomuceno", aluno.getCidade().getNome());
    }

    @Test
    void deveRetornarCoordenadorCursoDeUmAluno(){
        Aluno aluno = new Aluno();
        Professor coodernador = new Professor();
        Curso curso =  new Curso();

        coodernador.setNome("Sandro");
        curso.setProfessor(coodernador);
        aluno.setCurso(curso);

        assertEquals("Sandro", aluno.getCoordenadorCurso());
    }
}