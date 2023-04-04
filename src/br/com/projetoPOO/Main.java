package br.com.projetoPOO;

import br.com.projetoPOO.bootcamp.Bootcamp;
import br.com.projetoPOO.bootcamp.pessoas.Aluno;
import br.com.projetoPOO.bootcamp.pessoas.Professor;
import br.com.projetoPOO.bootcamp.servicos.Curso;
import br.com.projetoPOO.bootcamp.servicos.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("João do Pé de Feijão");

        Aluno aluno = new Aluno();
        aluno.setNome("Nicolau do Pé de Cacau");

        Curso curso = new Curso();
        curso.setTitulo("Curso de HTML");
        curso.setDescricao("Curso introdutório de HTML.");
        curso.setCargaHoraria(32);
        curso.setProfessor(professor);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Live de HTML");
        mentoria.setDescricao("Live introdutória de HTML.");
        mentoria.setData(LocalDate.now());
        mentoria.setPalestrante(professor);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp em HTML");
        bootcamp.setDescricao("Bootcamp de iniciação em HTML.");
        bootcamp.setDuracao(15);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        professor.getConteudosInscritos().add(curso);
        professor.getConteudosInscritos().add(mentoria);
        aluno.getConteudosInscritos().add(curso);
        aluno.getConteudosInscritos().add(mentoria);

        professor.inscreverBootcamp(bootcamp);

        aluno.inscreverBootcamp(bootcamp);

        //Antes da progressão:
        System.out.println();
        System.out.println(aluno);
        aluno.progredir();
        aluno.progredir();

        //Depois da progressão:
        System.out.println();
        System.out.println(aluno);

        //Outros dados:
        System.out.println();
        System.out.println(curso);
        System.out.println();
        System.out.println(mentoria);
    }
}