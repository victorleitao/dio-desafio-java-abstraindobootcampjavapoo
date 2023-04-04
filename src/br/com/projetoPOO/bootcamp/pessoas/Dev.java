package br.com.projetoPOO.bootcamp.pessoas;

import br.com.projetoPOO.bootcamp.Bootcamp;
import br.com.projetoPOO.bootcamp.servicos.Conteudo;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    public abstract void inscreverBootcamp(Bootcamp bootcamp);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
}
