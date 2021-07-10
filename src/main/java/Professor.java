public class Professor extends Pessoa{

    private String escolaridade;
    private String cidadeNtural;
    private String tipoEnsino;

    public String getEscolaridade() {
        return escolaridade;
    }

    public Professor setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
        return this;
    }

    public String getCidadeNtural() {
        return cidadeNtural;
    }

    public Professor setCidadeNtural(String cidadeNtural) {
        this.cidadeNtural = cidadeNtural;
        return this;
    }

    public String getTipoEnsino() {
        return tipoEnsino;
    }

    public Professor setTipoEnsino(String tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }
}
