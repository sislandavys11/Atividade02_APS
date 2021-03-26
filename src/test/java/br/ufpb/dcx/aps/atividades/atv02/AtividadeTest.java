package br.ufpb.dcx.aps.atividades.atv02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtividadeTest {

    Disciplina disciplina;

    @BeforeEach
    void setUp() {
        disciplina = new Disciplina(123);
    }

    @Test
    void testDisciplina() {

        assertEquals(123,disciplina.getCodigoDisciplina());

        assertNull(disciplina.getTurma(0));

        Turma turma = disciplina.criarTurma(1);
        assertNotNull(turma);
        assertEquals(1,turma.getCodigo());
        assertNotNull(disciplina.getTurma(1));

        disciplina.criarTurma(2);
        assertNotNull(disciplina.getTurma(2));


        Exception exception = assertThrows(RuntimeException.class, () ->
                disciplina.criarTurma(-1));
        assertEquals("Código de turma inválido: -1", exception.getMessage());


    }

    @Test
    void testTurma() {
        Turma turma1 = disciplina.criarTurma(1);
        turma1.setProfessor(new Professor("Joao"));
        assertEquals("Joao",turma1.getProfessor().getNome());

        assertNull(turma1.getAluno(222));

        turma1.addAluno(new Aluno(2134,"Maria"));
        assertNotNull(turma1.getAluno(2134));
        assertEquals("Maria",turma1.getAluno(2134).getNome());
        turma1.addAluno(new Aluno(324,"Jose"));

    }


    @Test
    void testProfessor(){
        Professor professor = new Professor();
        assertEquals("",professor.getNome());
        professor.setNome("Nome Teste");
        assertEquals("Nome Teste",professor.getNome());
    }
}
