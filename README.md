
# Injeção de Dependência

A injeção de dependência é um princípio de design que se baseia na ideia de que as classes
não devem ser responsáveis por criar suas próprias dependências, mas sim recebê-las de
alguma outra fonte. Isso é feito através da inversão de controle, onde o controle da
criação e inicialização das dependências é passado para uma entidade externa, geralmente
chamada de container ou gerenciador de dependências.


### Vantagem

A DI é uma prática muito comum em projetos de software, pois ajuda a tornar o código mais
fácil de testar, manter e evoluir. Isso é possível pois as classes ficam menos acopladas
entre si, o que permite que elas possam ser testadas e modificadas independentemente umas
das outras.


### Uso no Projeto

No projeto mencionado, a injeção de dependência foi usada para mostrar como essa técnica
funciona em um pequeno trecho de código. Isso foi feito através da utilização de uma classe
container ou gerenciador de dependências, que é responsável por instanciar e gerenciar as
dependências e injetá-las nas classes que as precisam. Além disso, a inversão de controle
também foi utilizada para deixar o código menos acoplado e mais livre para novas
implementações.