# Aula 1 (14/02/2025)
### Atividade 1 - Programming Over Time
*Texto 1:*
> Nós propomos que a "engenharia de software" engloba não apenas o ato de escrever código, mas também todas as ferramentas e processos que uma organização utiliza para construir e manter esse código ao longo do tempo. Quais práticas uma organização de software pode adotar para manter seu código valioso a longo prazo? Como os engenheiros podem tornar uma base de código mais sustentável e a própria disciplina de enenharia de software mais rigorosa? Não temos respostas definitivas para essas perguntas, mas esperamos que a experiência coletiva do Google ao longo das últimas duas décadas ilumine possíveis caminhos para encontrá-las.
> Um insight importante que compartilhamos neste livro é que a engenharia de software pode ser pensada como "programação integrada ao longo do tempo". Quais práticas podemos introduzir em nosso código para torná-lo sustentável — capaz de reagir a mudanças necessárias — durante todo o seu ciclo de vida, desde a concepção até a introdução, manutenção e descontinuação? O livro enfatiza três princípios fundamentais que acreditamos que as organizações de software devem ter em mente ao projetar, arquitetar e escrever seu código:
>-  **Tempo e Mudança:** Como o código precisará se adaptar ao longo de sua vida útil.
>- **Escala e Crescimento:** Como uma organização precisará se adaptar à medida que evolui.
> - **Trade-offs e Custos:** Como uma organização toma decisões com base nas lições de Tempo e Mudança e Escala e Crescimento.

*Resposta:*

**`Comentário:`** O trecho do livro descreve a profissão de engenheiro de software e como as empresas buscam a evolução e a adaptação dos códigos de seus programas, já que, com o tempo, ocorrem mudanças tanto leves quanto bruscas. Além disso, o texto demonstra a importância de tornar os códigos sustentáveis e duráveis.
Portanto, a profissão de engenharia de software vai além da simples escrita de código; envolve considerar o ciclo de vida completo do software, desde a criação até a descontinuação. O engenheiro é a mente por trás de decisões cuidadosas e assertivas, garantindo a sustentabilidade e a evolução do código.

### Atividade 2
*Texto 2:*
>"O que exatamente queremos dizer com engenharia de software? O que distingue "engenharia de software" de "programação" ou "ciência da computação"? E por que o Google teria uma perspectiva única a acrescentar ao corpo de literatura anterior sobre engenharia de software escrita ao longo dos últimos 50 anos?

>Os termos "programação" e "engenharia de software" têm sido usados de forma intercambiável em nossa indústria por bastante tempo, embora cada termo tenha um foco e implicações diferentes. Os estudantes universitários tendem a estudar ciência da computação e a conseguir empregos escrevendo código como "programadores".

>"Engenharia de software", no entanto, soa mais sério, como se implicasse a aplicação de algum conhecimento teórico para construir algo real e preciso. Engenheiros mecânicos, civis, aeronáuticos e aqueles de outras disciplinas de engenharia todos praticam engenharia. Eles todos trabalham no mundo real e usam a aplicação de seu conhecimento teórico para criar algo real. Engenheiros de software também criam "algo real", embora seja menos tangível do que as coisas que outros engenheiros criam.

>Ao contrário dessas profissões de engenharia mais estabelecidas, a teoria ou prática atual da engenharia de software não é tão rigorosa. Engenheiros aeronáuticos devem seguir diretrizes e práticas rígidas, porque erros em seus cálculos podem causar danos reais; a programação, no geral, tradicionalmente não seguiu tais práticas rigorosas. Mas, à medida que o software se torna mais integrado em nossas vidas, devemos adotar e confiar em métodos de engenharia mais rigorosos. Esperamos que este livro ajude os outros a verem um caminho em direção a práticas de software mais confiáveis."

*Resposta:*

**`Comentário:`** 
Ao longo do texto, percebemos a diferença entre profissionais de TI e engenheiros de software, cada termo tem um foco e implicações diferentes. As pessoas que estudam TI tendem a trabalhar em empregos escrevendo código, ou seja, como programadores. Já o Engenheiro de software tem um ar mais sério, pois existe uma perspectiva de aplicação e implicação de conhecimento para a construção de algo mais preciso. No entanto, mesmo com essa classificação, de acordo com o texto, ela não é tão rigorosa comparadas a outras profissões de engenharia. Mas isso não é verdade, com o tempo e a mudança, as aplicações se tornam complexas e escaláveis. 
Portanto, os engenheiros de software precisam estar atentos a essas mudanças e construirem softwares mais confiáveis. 

### Atividade 3 - tradeoff(troca):
> TradeOff se baseia no conceito de "Troca Equivalente". 
- Java é mais lento que a linguagem C devido a sua complexidade e é uma linguagem longe do baixo nível, porém necessitou a troca de uma aplicação rápida por portabilidade através da JVM.
- Python usa C para operações aritméticas e matemáticas, pois o python tem a missão de trazer algo mais fácil de desenvolver, porém trocou a complicação por facilidade e rapidez.
- Banco do Brasil que utilizavam uma arquitetura menos complexa e com menos escabilidade, entretanto com o tempo e o alto volume de transações, ela estava se tornando menos eficiente, pois algumas transações se perdiam. Portanto, a solução foi a troca para uma arquitetura mais complexa para suportar a alta escalabilidade.

# 21/02/2025
### Atividade 4 - Classe UML 
***Classe UML - Loja Eletrônicos***

![Classe UML](https://github.com/user-attachments/assets/ea3a3c0f-6400-4c66-bf0e-417a22061ad0)

## Atividade 5 - Java
***Classe Principal - LojaEletronicos***

_Arquivo: LojaEletronicos.java_

```java
package loja;

import java.util.LinkedList;
import java.util.List;

public class LojaEletronicos {

	// Lista de objetos privada criada para armazenar os tipos de celulares da loja

	private List<Celular> celulares = new LinkedList<Celular>();

	// Metodo para cadastrar um celular na lista

	public void cadastrarCelular(Celular celular) {
		celulares.add(celular);
	}

	public List<Celular> getCelular() {
		return celulares;
	}

	// Encontrar o celular dentro da lista privada

	public List<Celular> encontrarCelular(String nome, String so) {
		List<Celular> encontrados = new LinkedList<Celular>();
		for(Celular celular: celulares) {
			if(celular.getNome().equals(nome) && (celular.getSo().equals(so))) {
				encontrados.add(celular);
			}
		}
		return encontrados;
	}
}
```

***Classe Celular***

_Arquivo: Celular.java_

```java
package loja;

import java.util.List;

public class Celular {
		private String nome;
		private String so;
		private String marca;
		private String cor;
		private double preco;
		
	//	//Criado o metodo construtor, definido como publico
		public Celular(String nome, String so, String marca, String cor, double preco) {
			this.nome = nome;
			this.so = so;
			this.marca = marca;
			this.cor = cor;
			this.preco = preco;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSo() {
			return so;
		}
		public void setSo(String so) {
			this.so = so;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public double getPreco() {
			return preco;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}
	
}

```

### Atividade 6 - Testes 

***Classe LojaEletronicoTest***

_Arquivo: LojaEletronicoTest.java_

```java
package loja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class LojaEletronicosTest {

	@Test
	void test() {
		LojaEletronicos loja = new LojaEletronicos();
		
		//Criando objetos para cadastrar 
		
		Celular Samsung = new Celular ("S25","Android", "Samsung", "Azul Marinho", 1900.99);
		Celular Apple = new Celular("Iphone 15 Pro Max","IOS", "Apple", "Branco", 5699.99);
		
		//Processo de novos celulares
		loja.cadastrarCelular(Samsung);
		loja.cadastrarCelular(Apple);
		
		//Verificando o cadastro dos celulares
		assertEquals(loja.getCelular().size(), 2);
		
		List<Celular> encontradosSamsung = loja.encontrarCelular("S25", "Android");
		List<Celular> encontradosApple = loja.encontrarCelular("Iphone 15 Pro Max", "IOS");
		
		assertEquals(encontradosSamsung.get(0).getMarca(), "Samsung");
		assertEquals(encontradosApple.get(0).getCor(), "Branco");
			
	}

}

```

### Atividade 7 - SQLite

***Classe Main***

_Arquivo: Main.java_

```java
package org.example;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        LojaEletronico loja = new LojaEletronico();
        loja.conectar();
        loja.criarTabela();
        loja.cadastrarCelular("S25", "Android", "Samsung", "Azul Marinho", 1900.99);
        loja.cadastrarCelular("Iphone 15 Pro MAX", "IOS","Iphone", "Branco", 5699.99);
        loja.encontrarCelular();

    }
}
```
***Classe LojaEletronico***

_Arquivo: LojaElettronico.java_

```java
package org.example;
import java.sql.*;

public class LojaEletronico {

    //Linkagem com meu banco de Eletrônicos
    private String url = "jdbc:sqlite:LojaEletronico.db";

    public void conectar() {
        //Tentando conectar com o link
        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexão com o banco de dados estabelecida.");
            }
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco: " + e.getMessage());
        }
    }

    // Usando parametro conn para estabelecer conexão e criando a tabela
    public void criarTabela(){
        String sql = "CREATE TABLE IF NOT EXISTS celular(\n"
                + "nome TEXT PRIMARY KEY, \n"
                + "so TEXT NOT NULL, \n"
                + "marca TEXT NOT NULL, \n"
                + "cor TEXT NOT NULL, \n"
                + "preco DOUBLE NOT NULL \n"
                + ");";
        // Verificação se há a tabela foi criada através da Classe t
        try(var conn = DriverManager.getConnection(url);
            var stmt = conn.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Tabela não foi criada" + e.getMessage());
        }
    }
    //Processo para cadastrar celulares
    public void cadastrarCelular(String nome, String so, String marca, String cor, Double preco){
        String sql = "INSERT INTO celular(nome, so, marca, cor, preco) VALUES(?,?,?,?,?)";

        //Verificar a inserção de dados
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, so);
            stmt.setString(3, marca);
            stmt.setString(4, cor);
            stmt.setDouble(5, preco);
            System.out.println("Celular cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public void encontrarCelular(){
        String sql = "SELECT * FROM celular ";

        try(var conn = DriverManager.getConnection(url);
            var stmt = conn.createStatement();

            var rs = stmt.executeQuery(sql)){
            System.out.println(rs);
            while (rs.next()){
                System.out.println("------------------------------");
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("so"));
                System.out.println(rs.getString("marca"));
                System.out.println(rs.getString("cor"));
                System.out.println(rs.getDouble("preco"));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
```

***POM.XML***

_Arquivo: pom.xml_

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>AtividadeSQLite</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <dependencies>
    <dependency>
        <groupId>org.xerial</groupId>
        <artifactId>sqlite-jdbc</artifactId>
        <version>3.49.1.0</version>
    </dependency>
    </dependencies>

</project>
```
