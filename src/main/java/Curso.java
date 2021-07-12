public class Curso {
    private Professor professor;
    private TipoEnsino tipoEnsino;
    private Escola escola;

    public Professor getProfessor() {
        return professor;
    }
    public Curso setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }
    public Curso setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }

    public Escola getEscola() {
        return escola;
    }
    public Curso setEscola(Escola escola) {
        this.escola = escola;
        return this;
    }

    public String getCoordenadorDoCurso(){
        return this.getProfessor().getNome();
    }
}