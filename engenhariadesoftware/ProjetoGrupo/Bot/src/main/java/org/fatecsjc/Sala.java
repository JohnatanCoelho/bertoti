package org.fatecsjc;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class Sala {


    // URL de conexão com o banco de dados SQLite
    private String url = "jdbc:sqlite:Sala.db";

    // Método para conectar ao banco de dados
    public Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Conexão com o banco de dados estabelecida!");
                // Habilitando as restrições de chave estrangeira
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute("PRAGMA foreign_keys = ON;");
                }
            }
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco: " + e.getMessage());
            return null;
        }

    }

    // Método para criar as tabelas no banco de dados
    public void criarTabelas() {
        // Definindo os comandos SQL para criar as tabelas
        String sqlSala = "CREATE TABLE IF NOT EXISTS sala (\n"
                + "id_sala INTEGER PRIMARY KEY AUTOINCREMENT, \n"
                + "numero_sala INT NOT NULL \n"
                + ");";

        String sqlAluno = "CREATE TABLE IF NOT EXISTS aluno (\n"
                + "matricula INTEGER PRIMARY KEY AUTOINCREMENT, \n"
                + "nome TEXT NOT NULL, \n"
                + "idade INTEGER NOT NULL, \n"
                + "id_sala INTEGER NOT NULL,\n"
                + "id_curso INTEGER NOT NULL, \n"
                + "FOREIGN KEY (id_sala) REFERENCES sala(id_sala),\n"
                + "FOREIGN KEY (id_curso) REFERENCES curso(id)\n"
                + ");";

        String sqlCurso = "CREATE TABLE IF NOT EXISTS curso(\n "
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, \n"
                + "nome_curso TEXT NOT NULL \n"
                + ");";


        // Conectar e criar as tabelas
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Criar a tabela sala primeiro
            stmt.execute(sqlSala);
            System.out.println("Tabela sala criada com sucesso!");

            // Criar a tabela aluno depois, já que ela depende da tabela sala
            stmt.execute(sqlAluno);
            System.out.println("Tabela aluno criada com sucesso!");

            stmt.execute(sqlCurso);
            System.out.println("Tabela curso criada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar as tabelas: " + e.getMessage());
        }
    }

    public void inserirDadosSala(Integer numero_sala){
        String sql = "INSERT INTO sala(numero_sala) VALUES(?)";

        try(Connection conn = DriverManager.getConnection(url); var stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, numero_sala);
            stmt.executeUpdate();
            System.out.println("Sala Cadastrada!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados em sala" + e.getMessage());
        }
    }

    public void inserirDadosCurso(String nome){
        String sql = "INSERT INTO curso(nome_curso) VALUES(?)";
        try(Connection conn = DriverManager.getConnection(url); var stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.executeUpdate();
            System.out.println("Curso Cadastrado!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void inserirDadosAluno(String nome, Integer idade, Integer id_sala, Integer id_curso){

        String sql = "INSERT INTO aluno(nome,idade,id_sala,id_curso) VALUES(?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url); var stmt = conn.prepareStatement(sql)){
            stmt.setString(1,nome);
            stmt.setInt(2,idade);
            stmt.setInt(3, id_sala);
            stmt.setInt(4, id_curso);
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Tool(name = "Ferramenta para listar os cursos alunos ")
    public List<Aluno> listarAlunos(){
        String sql = "SELECT * FROM aluno";
        List<Aluno> alunos = new ArrayList<Aluno>();
        try(Connection conn = DriverManager.getConnection(url); PreparedStatement pst = conn.prepareStatement(sql); var rs = pst.executeQuery()){
                while(rs.next()){
                    Aluno aluno = new Aluno();
                    aluno.setMatricula(rs.getInt("matricula"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setIdade(rs.getInt("idade"));
                    aluno.setId_sala(rs.getInt("id_sala"));
                    aluno.setId_curso(rs.getInt("id_curso"));
                    alunos.add(aluno);
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return alunos;
    }

    @Tool("Ferramenta para listar os cursos da escola")
    public List<Curso> listarCursos(){
        List<Curso> cursos = new ArrayList<>();

        String sql = "SELECT * FROM curso";

        try{
           Connection conn = conectar();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                Curso novoCurso = new Curso();
                novoCurso.setId_curso(rs.getInt("id"));
                novoCurso.setNome_curso(rs.getString("nome_curso"));
                cursos.add(novoCurso);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar os cursos: " + e.getMessage());
        }

        return cursos;
    }


    public static void main(String[] args) {
        Sala aula = new Sala();
        aula.conectar();
       aula.criarTabelas();

      aula.inserirDadosSala(302);
      aula.inserirDadosSala(304);

      aula.inserirDadosCurso("Banco de Dados");
      aula.inserirDadosCurso("Análise e Desenvolvimento de Sistemas");

       aula.inserirDadosAluno( "Raul Sanches", 19, 1, 1);
       aula.inserirDadosAluno("Yuri Alberto", 22, 1, 1 );
       aula.inserirDadosAluno("Johnatan Coelho", 21, 1, 1);
       aula.inserirDadosAluno("Victor Miguel", 23, 1, 1);
      aula.inserirDadosAluno("Davi Pires", 19, 1, 1);
      aula.inserirDadosAluno("Vinicius de Pádua", 1, 1, 1);
       aula.inserirDadosAluno("Abimael Santana", 1, 1, 1);

       aula.inserirDadosAluno("Roberto Alves", 28, 2, 2);
       aula.inserirDadosAluno("Jackson Rodrigues", 45, 2, 2);
       aula.inserirDadosAluno("Diego Moreira", 35, 2, 2 );
       aula.inserirDadosAluno("Gilberto Gil", 41, 2, 2);
       aula.inserirDadosAluno( "Ronaldo Tavares", 35, 2, 2);
       aula.inserirDadosAluno("Pietro Gonçalves", 26, 2,2);
       aula.inserirDadosAluno("Nathalia Alves", 20, 2, 2);
       aula.inserirDadosAluno("Giuliano Bertoti", 53, 2,2);


        aula.listarCursos();
       aula.listarAlunos();

    }
}
