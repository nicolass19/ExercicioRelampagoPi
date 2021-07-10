public class Escolaridade {

    private Pessoa professor;
    private Pessoa diretor;
    private Pessoa coordenador;

    public Pessoa getProfessor() {
        return professor;
    }

    public Escolaridade setProfessor(Pessoa professor) {
        this.professor = professor;
        return this;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public Escolaridade setDiretor(Pessoa diretor) {
        this.diretor = diretor;
        return this;
    }

    public Pessoa getCoordenador() {
        return coordenador;
    }

    public Escolaridade setCoordenador(Pessoa coordenador) {
        this.coordenador = coordenador;
        return this;
    }

    public String getEscolaridadeProfessor(){
        return professor.getEscolaridade();
    }

    public String getEscolaridadeCoordenador(){
        return coordenador.getEscolaridade();
    }

    public String getEscolaridadeDiretor(){
        return diretor.getEscolaridade();
    }

}
