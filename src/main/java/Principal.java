public class Principal {

    public static void main(String[] args) {
        Curso curso = new Curso();
        Professor professor = new Professor();

        professor.setNome("nicolas");

        curso.setCoordenador(professor);

        System.out.println(curso.getNomeCoordenador());
    }
}
