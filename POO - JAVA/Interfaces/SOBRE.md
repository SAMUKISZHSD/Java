# Programação Orientada a Interfaces
Interfaces

<br> Podemos definir como interface o contrato entre a classe e o mundo exterior. Quando uma classe implementa uma interface, se compromete a fornecer o comportamento publicado por esta interface. </br>

<br> As classes ajudam a definir um objeto e seu comportamento e as interfaces que auxiliam na definição dessas classes. As interfaces são formadas pela declaração de um ou mais métodos, os quais obrigatoriamente não possuem corpo. </br>

<br> As operações específicas para cada um desses métodos são realizadas pela classe que implementa. De um modo geral, podemos dizer que as interfaces definem certas funcionalidades, as quais dependem das classes que implementam as interfaces para que os métodos existam. </br>

<br> A implementação de interfaces também pode ser realizadas por meio de Structs. </br>

<br> Em uma mesma classe, podem ser implementadas uma ou mais interfaces, sendo que elas devem estar separadas por vírgulas. Se uma classe implementa uma determinada interface, todos os métodos declarados nessa interface implementada devem ser definidos na respectiva classe. Caso isso não ocorra, será gerado um erro de compilação. </br>

<br> Um objeto de um tipo definido por uma interface não pode ser instanciado de forma alguma. </br>

<br> Os membros declarados em uma interface são implicitamente públicos. Neste ponto, devemos considerar que não é permitido declarar variáveis em uma interface, isto em virtude desta ser uma implementação do atributo de um objeto. </br>

<br> Como exemplo da utilização de interfaces, podemos citar quando trabalhamos com componentes gráficos na tela do computador, em que utilizamos botões, janelas e outros itens. Neste caso, temos várias interfaces com diversos métodos para o tratamento de eventos que podem ocorrer nesses componentes. </br>

<br> Dentro esses eventos, podemos ter os seguintes: fechar a janela, abrir a janela, clicar sobre um botão, etc. Os métodos que capturam esses eventos estão definidos em interfaces específicas, mas a ação a ser executada quando um destes eventos ocorrer é de responsabilidade da classe que implementou a interface. É por isso que os métodos declarados na interface não possuem corpo.  </br>

<div align="center">

<p href = 'https://www.devmedia.com.br/interfaces-programacao-orientada-a-objetos/18695'> Veja sobre aqui</p>

</div>
