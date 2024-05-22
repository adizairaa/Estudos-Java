## Sistema de Gerenciamento de Biblioteca

-Este é um sistema simples de gerenciamento de biblioteca desenvolvido em Java, com uma interface gráfica de usuário (GUI) utilizando a biblioteca Swing.

### Funcionalidades
- Adicionar Livros: Os usuários podem adicionar livros à biblioteca fornecendo detalhes como título, autor e ano de publicação.
- Interfaces de Usuário Diferenciadas: Existem três interfaces de usuário distintas:
- Bibliotecário: Permite ao bibliotecário adicionar livros à biblioteca.
- Membro da Biblioteca: Permite aos membros da biblioteca visualizar os livros disponíveis.
- Acervo de Livros: Visualização do acervo disponível na biblioteca.
- Administrador: Similar à interface do membro da biblioteca, permite ao administrador visualizar os livros disponíveis.
- Opção de Sair: Os usuários podem sair do sistema com segurança, com uma caixa de diálogo de confirmação ao clicar em "Sair".

### Estrutura do Código

-O código está organizado em três partes principais:

### 1 Lógica de Negócios (logic):
Contém a classe Biblioteca que define a estrutura da biblioteca e permite adicionar livros a ela.
A classe AcervoDeLivroshe rda de `JFrame` e é responsável por criar a janela que exibe o acervo de livros.

#### Biblioteca.java:

- A classe `Biblioteca` representa a biblioteca e mantém uma lista de livros.
- Um construtor inicializa a lista de livros.
- O método `adicionarLivro` permite adicionar um novo livro à biblioteca.
- O método `getLivros` retorna a lista de livros na biblioteca.

  #### Livro.java:

- A classe `Livro` define a estrutura de um livro, incluindo propriedades como título, autor e ano de publicação.
- Um construtor é fornecido para inicializar um objeto `Livro` com os valores fornecidos.
- Métodos de acesso (`get`) estão disponíveis para recuperar detalhes específicos do livro, como título, autor e ano de publicação.

 ### Acervo de Livros:
 - Esta classe proporciona uma interface gráfica que permite aos usuários visualizar e buscar livros pelo título.
Componentes principais:
 - List<String[]> livros: Lista de livros, onde cada livro é representado por um array de strings contendo informações como ID, título, autor, ano de publicação e status.
 - DefaultTableModel tableModel: Modelo da tabela utilizado para gerenciar os dados exibidos na interface gráfica.
 - O construtor AcervoDeLivros(List<String[]> livros): Inicializa a interface com uma tabela que exibe os livros e um painel de busca. Configura os componentes da interface gráfica, incluindo o painel de busca, a tabela de livros e seus modelos de dados.


### Interfaces do Usuário (ui): 
-Inclui três classes de interface de usuário:

#### InterfaceBibliotecario.java:

- Esta classe representa a interface do usuário para o bibliotecário.
- Ela estende a classe `JFrame` para criar uma janela de interface gráfica.
- Campos de texto permitem inserir informações sobre um novo livro, como título, autor e ano de publicação.
- Um botão "Adicionar Livro" permite ao bibliotecário adicionar um novo livro à biblioteca quando os detalhes são preenchidos.

#### InterfaceMembroBiblioteca.java:

- Esta classe representa a interface do usuário para o membro da biblioteca.
- Também estende a classe `JFrame`.
- A interface inclui um botão "Mostrar Livros" que, quando clicado, exibe uma janela com a lista de todos os livros disponíveis na biblioteca.

#### InterfaceAdministrador.java:

- Esta classe representa a interface do usuário para o administrador.
- Também estende a classe `JFrame`.
- A interface é semelhante à do membro da biblioteca, com um botão "Mostrar Livros" para exibir a lista de livros disponíveis.

### Classe Principal (main):

#### Menu.java
-A classe Menu é a classe principal que inicia o programa. 
- Ela cria a janela principal, configura a barra de menu e adiciona os itens de menu correspondentes às interfaces de usuário.
- menu
- sobre
- Acervo de livros 

### Funcionamento Geral:

- Ao executar o programa, a classe `Main` é iniciada.
- Ela cria uma instância da `Biblioteca` e, em seguida, instâncias das interfaces do usuário.
- Cada interface oferece funcionalidades específicas de acordo com o tipo de usuário, como adicionar livros para o bibliotecário e mostrar livros para membros da biblioteca e administradores.
- As interfaces são implementadas usando a biblioteca Swing do Java para criar elementos de interface gráfica, como janelas, botões e campos de texto.
-
  #### Dependências
Java Swing: Esta aplicação utiliza a biblioteca Swing para criar elementos de interface gráfica, como janelas, menus e botões.

### Propriedades para Criar uma Interface Gráfica:

- **JFrame:** O contêiner principal para uma janela de interface gráfica.
- **JPanel:** Contêiner que pode conter outros componentes de interface gráfica.
- **JLabel:** Usado para exibir texto ou imagens na interface do usuário.
- **JTextField:** Campo de texto onde os usuários podem inserir texto.
- **JButton:** Botão que pode ser clicado pelo usuário para realizar uma ação.
- **JTable**: Tabela que exibe os dados dos livros.
- **JScrollPane:** Componente que adiciona uma barra de rolagem à tabela de livros.
- **ActionListener:** Interface usada para lidar com eventos de ação, como clicar em um botão.
- **Layout Manager:** Usado para controlar a disposição e o dimensionamento dos componentes dentro de um contêiner.
- **DefaultTableModel tableModel**: Modelo da tabela para gerenciar os dados exibidos.
- **PopulateTable(List<String[]> livros)**: Popula a tabela com a lista de livros fornecida, limpando qualquer dado existente na tabela e adicionando as novas linhas correspondentes aos livros.
- **SearchButton.addActionListener(ActionEvent e):** Adiciona um ouvinte de ação ao botão de busca que filtra a lista de livros com base no texto de busca fornecido pelo usuário e atualiza a tabela com os resultados da busca.
