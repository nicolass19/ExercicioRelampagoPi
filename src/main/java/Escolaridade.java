public class Escolaridade {

    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public Escolaridade setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public String getEscolaridadeProfessor(){
        return professor.getEscolaridade();
    }

}
