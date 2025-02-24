# Aula 1 (14/02/2025)
Crie um repositório chamado "bertoti" -> pasta "engenhariadesoftware" -> arquivo "readme.md" e faça as seguintes atividades (já vou comentá-las):
 
1. Comentar com suas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly. (vou postar abaixo)
 
2. Comentar com suas palavras o segundo trecho do livro Software Engineering at Google, Oreilly.(vou postar abaixo)
 
3. Listar e explicar 3 exemplos de tradeoffs

O que é Engenharia de Software? (professor)
Engenharia envolve programação, tempo, escala e tradeoff.
 
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

### Atividade 4 - Classe UML
***Classe UML - Loja Eletrônicos***

![LojaEletronico](https://github.com/user-attachments/assets/4375896e-d3d0-41ac-aef9-063284d970e9)

## Atividade 5 - Java
***Classe Principal - LojaEletronicos***
_Arquivo: LojaEletronicos.java_

```ruby
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
	//Buscando o celulares cadastrados
	public List<Celular> getCelular() {
		return celulares;
	}

		//Encontrar o celular dentro da lista privada
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

```ruby
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
```ruby
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
