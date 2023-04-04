package br.com.projetoPOO.bootcamp.servicos;

import br.com.projetoPOO.bootcamp.pessoas.Professor;

public class Curso extends Conteudo {

    private int cargaHoraria;
    private Professor professor;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "\ntítulo = " + getTitulo() +
                "\ndescrição = " + getDescricao() +
                "\ncargaHorária = " + this.cargaHoraria +
                "\nprofessor = " + this.professor.getNome() +
                " }";
    }
}
