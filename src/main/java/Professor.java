public class Professor extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public Professor setCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public String getEscolaridadeProfessor(){
        return this.getEscolaridade().getNivelEscolaridade();
    }

    public String getTipoDeEnsinoProfessor(){
        return this.getCurso().getTipoEnsino().getTipoDeEnsinoProfessor();
    }
}