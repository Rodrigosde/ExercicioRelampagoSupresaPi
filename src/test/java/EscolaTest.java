import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void deveRetornarEscolaridadeDiretorDeUmaEscola(){
        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Escola escola = new Escola();

        escolaridade.setNivelEscolaridade("Pos-Doutorado");
        diretor.setEscolaridade(escolaridade);
        escola.setProfessor(diretor);

        assertEquals("Pos-Doutorado", escola.getProfessor().getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarEstadoQueAlunoEstuda(){
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setUnidadeFederativa("SP");
        cidade.setEstado(estado);
        escola.setCidade(cidade);

        assertEquals("SP", escola.estadoDoAluno());
    }
}