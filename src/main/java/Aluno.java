public class Aluno extends Pessoa{

    private String estadoNatural;
    private String estadoEstuda;

    public String getEstadoNatural() {
        return estadoNatural;
    }

    public Aluno setEstadoNatural(String estadoNatural) {
        this.estadoNatural = estadoNatural;
        return this;
    }

    public String getEstadoEstuda() {
        return estadoEstuda;
    }

    public Aluno setEstadoEstuda(String estadoEstuda) {
        this.estadoEstuda = estadoEstuda;
        return this;
    }
}
