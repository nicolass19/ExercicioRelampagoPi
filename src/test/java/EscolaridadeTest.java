import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {

    @Test
    void informarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor();

        professor.setEscolaridade("Sistemas de Informacao");

        escolaridade.setProfessor(professor);

        assertEquals("Sistemas de Informacao", escolaridade.getEscolaridadeProfessor());
    }
}