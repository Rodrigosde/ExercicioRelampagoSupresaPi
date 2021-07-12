public class Escola {
    private Professor professor;
    private Cidade cidade;

    public Professor getProfessor() {
        return professor;
    }
    public Escola setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public Escola setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    public String estadoDoAluno(){
        return this.getCidade().getEstado().getUnidadeFederativa();
    }
}