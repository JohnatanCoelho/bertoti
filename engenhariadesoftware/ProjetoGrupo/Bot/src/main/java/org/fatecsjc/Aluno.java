package org.fatecsjc;

public class Aluno {
    private Integer matricula;
    private String nome;
    private Integer idade;
    private Integer id_sala;
    private Integer id_curso;

    // Get do Aluno

    public Integer getMatricula(){
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public Integer getId_curso() {
        return id_curso;
    }

    // Sets do aluno

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setId_sala(Integer id_sala) {
        this.id_sala = id_sala;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }
}
