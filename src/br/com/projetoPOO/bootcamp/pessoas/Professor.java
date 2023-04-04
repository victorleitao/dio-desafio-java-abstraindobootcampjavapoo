package br.com.projetoPOO.bootcamp.pessoas;

import br.com.projetoPOO.bootcamp.Bootcamp;

import java.util.Objects;

public class Professor extends Dev {

    public Professor() {
    }

    @Override
    public void inscreverBootcamp(Bootcamp bootcamp) {
        getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getProfessoresInscritos().add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(this.getNome(), professor.getNome()) &&
                Objects.equals(this.getConteudosInscritos(), professor.getConteudosInscritos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos());
    }
}
