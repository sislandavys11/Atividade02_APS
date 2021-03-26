package br.ufpb.dcx.aps.atividades.atv02;

import java.util.LinkedList;
import java.util.List;

public class Turma {
    private int codigo;
    private Professor professor;
    private List<Aluno> alunos = new LinkedList<Aluno>();
    private Aluno aluno;

    public Turma (int codTurma){
        this.codigo = codTurma;
    }
    public Turma(){
        this.codigo = 0;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(int matricula) {
        Aluno al = new Aluno();
        if (alunos.isEmpty()){
            al = null;
        }
        for (Aluno a: alunos){
            if (matricula == a.getMatricula()){
                al = a;
            }
        }
        return al;
    }

    public int getCodigo() {
        return codigo;
    }
}
