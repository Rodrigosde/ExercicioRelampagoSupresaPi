public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade;

    public String getNome() {
        return nome;
    }
    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }
    public Pessoa setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public Pessoa setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }
}