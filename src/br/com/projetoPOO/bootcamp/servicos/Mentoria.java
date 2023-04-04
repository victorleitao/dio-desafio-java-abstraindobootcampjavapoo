package br.com.projetoPOO.bootcamp.servicos;

import br.com.projetoPOO.bootcamp.pessoas.Professor;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;
    private Professor palestrante;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Professor getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Professor palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "\ntítulo = " + getTitulo() +
                "\ndescrição = " + getDescricao() +
                "\ndata = " + this.data +
                "\npalestrante = " + this.palestrante.getNome() +
                " }";
    }
}