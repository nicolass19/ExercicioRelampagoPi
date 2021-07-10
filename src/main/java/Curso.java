public class Curso {

    private Professor coordenador;

    public Professor getCoordenador() {
        return coordenador;
    }

    public Curso setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
        return this;
    }

    public String getNomeCoordenador(){
        return this.coordenador.getNome();
}
}
