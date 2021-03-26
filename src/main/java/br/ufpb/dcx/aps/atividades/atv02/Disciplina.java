package br.ufpb.dcx.aps.atividades.atv02;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int codigoDisciplina;
    private List<Turma> turmas = new LinkedList<Turma>();
    private Turma turma;

    public Disciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }



    public int getCodigoDisciplina() {

        return codigoDisciplina;
    }

    public Turma criarTurma(int codTurma){
        if (codTurma >=1) {
            Turma addTurma = new Turma(codTurma);
            turmas.add(addTurma);
            return addTurma;
        }else {
            throw new RuntimeException("Código de turma inválido: -1");
        }
    }

    public Turma getTurma(int codTurma) {
        for (Turma t: turmas){
            if(t.getCodigo() == codTurma){
                this.turma = t;


            }
        }
        if (turmas.isEmpty()){
            turma = null;
        }
        return turma;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
