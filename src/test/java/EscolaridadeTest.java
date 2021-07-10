import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {

    @Test
    void informarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Pessoa professor = new Pessoa();

        professor.setEscolaridade("Fisica");

        escolaridade.setProfessor(professor);
        assertEquals("Fisica", escolaridade.getEscolaridadeProfessor());
    }

    @Test
    void informarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        Pessoa coordenador = new Pessoa();

        coordenador.setEscolaridade("Sistemas de Informacao");

        escolaridade.setCoordenador(coordenador);
        assertEquals("Sistemas de Informacao", escolaridade.getEscolaridadeCoordenador());
    }

    @Test
    void informarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        Pessoa diretor = new Pessoa();

        diretor.setEscolaridade("Matematica");

        escolaridade.setDiretor(diretor);
        assertEquals("Matematica", escolaridade.getEscolaridadeDiretor());
    }
}