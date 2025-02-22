# Aula 1 (14/02/2025)
crie um repositório chamado "bertoti" -> pasta "engenhariadesoftware" -> arquivo "readme.md" e faça as seguintes atividades (já vou comentá-las):
 
1. Comentar com suas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly. (vou postar abaixo)
 
2. Comentar com suas palavras o segundo trecho do livro Software Engineering at Google, Oreilly.(vou postar abaixo)
 
3. Listar e explicar 3 exemplos de tradeoffs

O que é Engenharia de Software? (professor)
Engenharia envolve programação, tempo, escala e tradeoff.

# Atividade 1 
## 1 - Programming Over Time
Nós propomos que a "engenharia de software" engloba não apenas o ato de escrever código, mas também todas as ferramentas e processos que uma organização utiliza para construir e manter esse código ao longo do tempo. Quais práticas uma organização de software pode adotar para manter seu código valioso a longo prazo? Como os engenheiros podem tornar uma base de código mais sustentável e a própria disciplina de enenharia de software mais rigorosa? Não temos respostas definitivas para essas perguntas, mas esperamos que a experiência coletiva do Google ao longo das últimas duas décadas ilumine possíveis caminhos para encontrá-las.

Um insight importante que compartilhamos neste livro é que a engenharia de software pode ser pensada como "programação integrada ao longo do tempo". Quais práticas podemos introduzir em nosso código para torná-lo sustentável — capaz de reagir a mudanças necessárias — durante todo o seu ciclo de vida, desde a concepção até a introdução, manutenção e descontinuação?
O livro enfatiza três princípios fundamentais que acreditamos que as organizações de software devem ter em mente ao projetar, arquitetar e escrever seu código:

Tempo e Mudança
Como o código precisará se adaptar ao longo de sua vida útil.

Escala e Crescimento
Como uma organização precisará se adaptar à medida que evolui.

Trade-offs e Custos
Como uma organização toma decisões com base nas lições de Tempo e Mudança e Escala e Crescimento.

**`Comentário:`** O trecho do livro descreve a profissão de engenheiro de software e como as empresas buscam a evolução e a adaptação dos códigos de seus programas, já que, com o tempo, ocorrem mudanças tanto leves quanto bruscas. Além disso, o texto demonstra a importância de tornar os códigos sustentáveis e duráveis.
Portanto, a profissão de engenharia de software vai além da simples escrita de código; envolve considerar o ciclo de vida completo do software, desde a criação até a descontinuação. O engenheiro é a mente por trás de decisões cuidadosas e assertivas, garantindo a sustentabilidade e a evolução do código.

## 2 -Atividade 2 - texto 2:
"O que exatamente queremos dizer com engenharia de software? O que distingue "engenharia de software" de "programação" ou "ciência da computação"? E por que o Google teria uma perspectiva única a acrescentar ao corpo de literatura anterior sobre engenharia de software escrita ao longo dos últimos 50 anos?

Os termos "programação" e "engenharia de software" têm sido usados de forma intercambiável em nossa indústria por bastante tempo, embora cada termo tenha um foco e implicações diferentes. Os estudantes universitários tendem a estudar ciência da computação e a conseguir empregos escrevendo código como "programadores".

"Engenharia de software", no entanto, soa mais sério, como se implicasse a aplicação de algum conhecimento teórico para construir algo real e preciso. Engenheiros mecânicos, civis, aeronáuticos e aqueles de outras disciplinas de engenharia todos praticam engenharia. Eles todos trabalham no mundo real e usam a aplicação de seu conhecimento teórico para criar algo real. Engenheiros de software também criam "algo real", embora seja menos tangível do que as coisas que outros engenheiros criam.

Ao contrário dessas profissões de engenharia mais estabelecidas, a teoria ou prática atual da engenharia de software não é tão rigorosa. Engenheiros aeronáuticos devem seguir diretrizes e práticas rígidas, porque erros em seus cálculos podem causar danos reais; a programação, no geral, tradicionalmente não seguiu tais práticas rigorosas. Mas, à medida que o software se torna mais integrado em nossas vidas, devemos adotar e confiar em métodos de engenharia mais rigorosos. Esperamos que este livro ajude os outros a verem um caminho em direção a práticas de software mais confiáveis."

**`Comentário:`** 
Ao longo do texto, percebemos a diferença entre profissionais de TI e engenheiros de software, cada termo tem um foco e implicações diferentes. As pessoas que estudam TI tendem a trabalhar em empregos escrevendo código, ou seja, como programadores. Já o Engenheiro de software tem um ar mais sério, pois existe uma perspectiva de aplicação e implicação de conhecimento para a construção de algo mais preciso. No entanto, mesmo com essa classificação, de acordo com o texto, ela não é tão rigorosa comparadas a outras profissões de engenharia. Mas isso não é verdade, com o tempo e a mudança, as aplicações se tornam complexas e escaláveis. 
Portanto, os engenheiros de software precisam estar atentos a essas mudanças e construirem softwares mais confiáveis. 

## Atividade 3 - tradeoff(troca):
- Java é mais lento que a linguagem C devido a sua complexidade e é uma linguagem longe do baixo nível, porém necessitou a troca de uma aplicação rápida por portabilidade através da JVM.
- Python usa C para operações aritméticas e matemáticas, pois o python tem a missão de trazer algo mais fácil de desenvolver, porém trocou a complicação por facilidade e rapidez.
- Banco do Brasil que utilizavam uma arquitetura menos complexa e com menos escabilidade, entretanto com o tempo e o alto volume de transações, ela estava se tornando menos eficiente, pois algumas transações se perdiam. Portanto, a solução foi a troca para uma arquitetura mais complexa para suportar a alta escalabilidade.

## Atividade 4 - Classe UML
***Classe UML - Loja Eletrônicos***

![LojaEletronico](https://github.com/user-attachments/assets/4375896e-d3d0-41ac-aef9-063284d970e9)

## Atividade 5 - Java
***Classe Principal - LojaEletronico***

![Captura de tela 2025-02-22 165824](https://github.com/user-attachments/assets/fda57785-a215-4f5c-98fb-0bdbcf6d882c)

***Classe Cliente***

![Captura de tela 2025-02-22 170005](https://github.com/user-attachments/assets/521b4f50-69d7-4202-811e-4d7e3b8dfec1)

***Classe LojaEletronicoTest***

![Captura de tela 2025-02-22 170410](https://github.com/user-attachments/assets/f4f7e500-351a-4510-a8fc-8c3c60ec9130)


## Atividade 6 - Testes 

***Teste LojaEletronicos***

![Captura de tela 2025-02-22 170410](https://github.com/user-attachments/assets/f4f7e500-351a-4510-a8fc-8c3c60ec9130)

![Captura de tela 2025-02-22 170904](https://github.com/user-attachments/assets/9a8c7250-05eb-4a82-924b-7ffba6976e7c)

