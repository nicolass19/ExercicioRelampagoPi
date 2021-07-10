import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void informarEscolaridadeProfessor() {
        Professor professor = new Professor();
        professor.setEscolaridade("ensino superior completo");
        assertEquals("ensino superior completo", professor.getEscolaridade());
    }
}