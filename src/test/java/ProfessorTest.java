import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void deveRetornarEscolaridadeProfessor(){
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setNivelEscolaridade("Doutor");
        professor.setEscolaridade(escolaridade);

        assertEquals("Doutor", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarCidadeDeNascimentoDeUmProfessor(){
        Professor professor = new Professor();
        Cidade cidade = new Cidade();

        cidade.setNome("Descoberto");
        professor.setCidade(cidade);

        assertEquals("Descoberto", professor.getCidade().getNome());
    }

    @Test
    void deveRetornarTipoDeEnsinoDoProfessor(){
        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        Curso curso = new Curso();

        tipoEnsino.setTipoDeEnsinoProfessor("Ensino Superior Completo");
        curso.setTipoEnsino(tipoEnsino);
        professor.setCurso(curso);

        assertEquals("Ensino Superior Completo", professor.getTipoDeEnsinoProfessor());
    }

    @Test
    void deveRetornarODiretorDeUmProfessor() {
        Professor professor = new Professor();
        Professor diretor = new Professor();
        Escola escola = new Escola();
        Curso curso = new Curso();

        diretor.setNome("Carlos");
        diretor.setCurso(curso);
        curso.setEscola(escola);
        escola.setProfessor(diretor);
        professor.setCurso(curso);

        assertEquals("Carlos", professor.getCurso().getEscola().getProfessor().getNome());
    }

    @Test
    void deveRetornarOCoordenadorDeUmProfessor() {
        Professor professor = new Professor();
        Professor coordenador = new Professor();
        Curso curso = new Curso();

        coordenador.setNome("Marcos");
        coordenador.setCurso(curso);
        curso.setProfessor(coordenador);
        professor.setCurso(curso);

        assertEquals("Marcos", professor.getCurso().getCoordenadorDoCurso());
    }
}