package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("ooo", 111);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private Integer numPage;



    public Livro(String nome, Integer numPage) {
        this.nome = nome;
        this.numPage = numPage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPage=" + numPage +
                '}';
    }
}

