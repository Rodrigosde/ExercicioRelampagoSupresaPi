public class Aluno extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public Aluno setCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public String getEstadoAluno(){
        return this.getCidade().getEstado().getUnidadeFederativa();
    }

    public String getCoordenadorCurso(){
        return this.getCurso().getProfessor().getNome();
    }
}