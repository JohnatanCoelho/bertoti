package org.fatecsjc;

public class Curso {

    private Integer id_curso;
    private String nome_curso;

    public Integer getId_curso(){
        return id_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setId_curso(Integer id_curso){
        this.id_curso = id_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }
}
