package main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import ui.InterfaceAdministrador;
import ui.InterfaceBibliotecario;
import ui.InterfaceMembroBiblioteca;
import logic.Biblioteca;

public class UpdateMenu extends JPanel {
    private BufferedImage backgroundImage;

    public UpdateMenu() {
        Biblioteca biblioteca = new Biblioteca();

        // Carrega a imagem de fundo OBS: AO FAZER UM PULL, TALVEZ A IMAGEM NÃO SEJA CARREGADA. TENTE ADAPTAR O CAMINHO DA IMAGEM CONFORME A SUA REALIDADE.
        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\Trocados\\codigoJava\\AtividadeTela\\src\\main\\background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Criação da barra de menu
        JMenuBar barramenu = new JMenuBar();

        // Criação dos menus
        JMenu fileMenu = new JMenu("Menu");
        JMenu aboutMenu = new JMenu("Sobre");
        JMenu collectioMenu = new JMenu("Acervo de livros"); // acrescentei o menu Acervo de livros 

        // Criação dos itens de menu para o menu
        JMenuItem bibliotecario = new JMenuItem("Bibliotecário");
        JMenuItem membro = new JMenuItem("Membro");
        JMenuItem administrador = new JMenuItem("Administrador");
        JMenuItem sair = new JMenuItem("Sair");

        // Criar o item de menu "Sobre"
        JMenuItem sobre = new JMenuItem("Sobre");
        aboutMenu.add(sobre);

        // Adicionar um ActionListener para o item de menu "Sobre"
        sobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                    "Sistema Bibliotecário\n Atividade de seminario da matéria de POO do 3º periodo do curso de ADS \n Sistema de gerenciamento de biblioteca desenvolvido em Java, com uma interface gráfica de usuário (GUI).\n \n\nProgramadores:\n- Adila \n- Yan \n- Natiele ",
                    "Sobre",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adiciona um ouvinte de ação ao item "Sair"
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe uma caixa de diálogo de confirmação ao clicar em "Sair"
                int option = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0); // Sai do programa
                }
            }
        });
        // ações ao clicar no menuitem bibliotecario
        bibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceBibliotecario interfaceBibliotecario = new InterfaceBibliotecario(biblioteca);
                interfaceBibliotecario.setVisible(true);
            }
        });
        // ações ao clicar no menuitem membro
        membro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceMembroBiblioteca interfaceMembroBiblioteca = new InterfaceMembroBiblioteca(biblioteca);
                interfaceMembroBiblioteca.setVisible(true);
            }
        });
        // ações ao clicar no menuitem Administrador
        administrador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceAdministrador interfaceAdministrador = new InterfaceAdministrador(biblioteca);
                interfaceAdministrador.setVisible(true);
            }
        });

        
        // Ações ao clicar no menuitem Acervo de Livros
        acervoDeLivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar lista de livros de exemplo usei somente livros voltados a programação 
                List<String[]> livros = new ArrayList<>();
                livros.add(new String[]{"1", "JAVA como programar ", "Paul Deitel", "2016", "Disponível"});
                livros.add(new String[]{"2", "Engenharia de Softwarw ", "Roger S. Pressman", "2021", "Emprestado"});
                livros.add(new String[]{"3", "Sistemas de Banco de Dados", "Elmasri", "2019", "Disponível"});
                livros.add(new String[]{"4", "Sistemas Operacionais Modernos", "Andrew S Tanenbaum", "2024", "Disponível"});
                livros.add(new String[]{"5", "Entendendo Algoritmos: guia Ilustrado", "Aditya Y.Bhargava", "2017", "Disponível"});
                livros.add(new String[]{"6", "Arquitetura Limpa", "Robert C. Martin", "2019", "Emprestado"});
                livros.add(new String[]{"7", "Introdução à Linguagem SQL ", "Thomas Nield ", "2016", "Emprestado"});
                livros.add(new String[]{"8", "Modelagem de Dados", "José Osvaldo de Sordi", "2019", "Disponível"});
                livros.add(new String[]{"9", "Governaça de Dados ", "Carlos Bardieri", "2019", "Disponível"});
               
                AcervoDeLivros acervoDeLivrosFrame = new AcervoDeLivros(livros);
                acervoDeLivrosFrame.setVisible(true);
            }
        });

        // Adiciona os menus à barra de menu
        barramenu.add(fileMenu);
        barramenu.add(aboutMenu);
        barramenu.add(collectioMenu);

         // Adiciona os itens de menu ao menu
        fileMenu.add(bibliotecario);
        fileMenu.add(membro);
        fileMenu.add(administrador);
        fileMenu.addSeparator(); // Adiciona uma linha separadora
        fileMenu.add(sair);
        collectioMenu.add(acervoDeLivros); // Adicionar o item de menu Acervo de Livros ao collectioMenu 

        // Define a barra de menu para este painel
        setLayout(new BorderLayout());
        add(barramenu, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema Bibliotecário");
        UpdateMenu panel = new UpdateMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 800);
        frame.add(panel);
        frame.setVisible(true);
    }
}
