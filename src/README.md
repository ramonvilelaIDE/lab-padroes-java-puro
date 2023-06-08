# Projeto Padrões de Java Puro

## Padrões de Projeto:

São soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.
O livro Design Patterns: Elements of Reusable Object-Oriented Software (1995) é a principal referência sobre o tema, com os autores
Gamma, Helm, Johnson e Vlissides conhecidos como "Gang of Four" (GoF).

### Padrões Criacionais: 
Abstract Factory, Builder, Factory Method, Prototype, Singleton.
Relação direta com instanciação ou criação múltipla de objetos

### Padrões Comportamentais: 
Chain of Responsability, Iterator, Observer, Strategy, Template Method.
Muito usado em abordagens de programação reativa. Relação muito forte para inferir comportamentos de uma determinada estrutura.

###Padrões Estruturais: 
Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy.
Relação entre integrações e chamadas externas.

## << Padrão Criacional >>
#### Singleton:
Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.

"tudo vai ser static em singleton".
"Deixo meu construtor privado. Deixo a minha instancia estatica, sendo acessível através de um método estático público".

## << Padrão Comportamental >>
### Strategy:
Simplificar a variação de algoritmos para a resolução de um mesmo problema.

"Ele usa bastante o conceito de polimorfismo".

"Alguma solução onde você queira fazer uma variação de  uma determinada implementação ou de um algoritmo, que eles respeitem uma mesma Interface, então usamos a Strategy".


## << Padrão Estrutural >>
### Facade:
Prover uma interface que reduza a complexidade nas interações com subsistemas.

"uma API pode fazer o papel de uma Facade".


# Links úteis
[Design Patterns GitHub](https://github.com/iluwatar/java-design-patterns)

[Design Patterns Java Examples](https://www.javatpoint.com/design-patterns-in-java)