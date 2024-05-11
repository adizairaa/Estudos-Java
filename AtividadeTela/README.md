## Sistema de Gerenciamento de Biblioteca

### Lógica de Negócios (logic):

#### Livro.java:

- A classe Livro é responsável por definir a estrutura de um livro, contendo propriedades como título, autor e ano de publicação.
- Foi implementado um construtor para facilitar a inicialização de um objeto Livro com os valores necessários.
- Métodos de acesso (get) foram implementados para permitir a recuperação de informações específicas do livro, tais como título, autor e ano de publicação.

#### Biblioteca.java:
- A classe Biblioteca representa a biblioteca e mantém uma lista de livros.
- Um construtor é responsável por inicializar a lista de livros da biblioteca.
- O método adicionarLivro está disponível para adicionar um novo livro à biblioteca.
- O método getLivros retorna a lista de livros presente na biblioteca.

### Interfaces do Usuário (ui):

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

#### Main.java:

- Esta classe é a classe principal que inicia o programa.
- No método `main`, uma instância da classe `Biblioteca` é criada.
- Em seguida, instâncias das interfaces do usuário são criadas para cada tipo de usuário (bibliotecário, membro da biblioteca e administrador).

### Funcionamento Geral:

- Ao executar o programa, a classe `Main` é iniciada.
- Ela cria uma instância da `Biblioteca` e, em seguida, instâncias das interfaces do usuário.
- Cada interface oferece funcionalidades específicas de acordo com o tipo de usuário, como adicionar livros para o bibliotecário e mostrar livros para membros da biblioteca e administradores.
- As interfaces são implementadas usando a biblioteca Swing do Java para criar elementos de interface gráfica, como janelas, botões e campos de texto.

### Propriedades para Criar uma Interface Gráfica:

- **JFrame:** O contêiner principal para uma janela de interface gráfica.
- **JPanel:** Contêiner que pode conter outros componentes de interface gráfica.
- **JLabel:** Usado para exibir texto ou imagens na interface do usuário.
- **JTextField:** Campo de texto onde os usuários podem inserir texto.
- **JButton:** Botão que pode ser clicado pelo usuário para realizar uma ação.
- **ActionListener:** Interface usada para lidar com eventos de ação, como clicar em um botão.
- **Layout Manager:** Usado para controlar a disposição e o dimensionamento dos componentes dentro de um contêiner.
