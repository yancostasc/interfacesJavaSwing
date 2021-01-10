package Interface;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame {

	private JTextField nomeTextField;
	private JTextField sobrenomeTextField;
	private JTextField emailTextField;
	private JTextField telefoneTextField;
    private JButton registerBotao;
    
    Font verdana = new Font("Verdana", Font.PLAIN,12);
    
    public LoginFrame(){
        configurarJanela();
    }

    private void configurarJanela()  {
        setTitle("Tela de Registro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,450);

        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        
        // COR DE FUNDO --------------------------------------------------
        panel.setBackground(Color.decode("#F5F5F5"));
        
        // A IMAGEM DO LADO ESQUERDO --------------------------------------                
        JLabel imagem = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/Renne/eclipse-workspace/aulas/src/Interface/galaxy.jpg"),390,430));
        imagem.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5F5"), 3, false));
        imagem.setBounds(5,5,375,400);
        
        
      	// TEXTOS DA INTERFACE --------------------------------------------
        JLabel labelCriarConta = new JLabel("Criar nova conta!");
        labelCriarConta.setBounds(400,15,320,24);
        labelCriarConta.setFont(new Font("Verdana", Font.BOLD,22)); 
        labelCriarConta.setForeground(Color.decode("#601791"));
        
        JLabel labelPequeno = new JLabel("Venha fazer parte da família de Testes!");
        labelPequeno.setBounds(400,35,320,24);
        labelPequeno.setFont(new Font("Verdana", Font.ITALIC,13)); 
        labelPequeno.setForeground(Color.decode("#8b8c91"));
        
        JLabel possui_Conta = new JLabel("Já possui uma conta?");
        possui_Conta.setBounds(400,360,320,24);
        possui_Conta.setFont(new Font("Verdana", Font.PLAIN,12)); 
        possui_Conta.setForeground(Color.decode("#8b8c91"));
        
        JLabel possui_Conta2 = new JLabel("Fazer Login");
        possui_Conta2.setBounds(538,360,320,24);
        possui_Conta2.setFont(new Font("Verdana", Font.BOLD,12)); 
        possui_Conta2.setForeground(Color.decode("#601791"));
        
        // CAMPOS DE DIGITAÇÃO --------------------------------------------------------
        nomeTextField = new JTextField(10);
        nomeTextField.setBounds(400,75,320,45);
        nomeTextField.setBackground(Color.decode("#F5F5F5"));
        nomeTextField.setFont(verdana);
        nomeTextField.setBorder(BorderFactory.createTitledBorder(null, "Nome", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Verdana",Font.PLAIN,14), Color.decode("#601791")));
        
        sobrenomeTextField = new JTextField(10);
        sobrenomeTextField.setBounds(400,135,320,45);
        sobrenomeTextField.setBackground(Color.decode("#F5F5F5"));
        sobrenomeTextField.setFont(verdana);
        sobrenomeTextField.setBorder(BorderFactory.createTitledBorder(null, "Sobrenome", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Verdana",Font.PLAIN,14), Color.decode("#601791")));        
        
        emailTextField = new JTextField(10);
        emailTextField.setBounds(400,195,320,45);
        emailTextField.setBackground(Color.decode("#F5F5F5"));
        emailTextField.setFont(verdana);
        emailTextField.setBorder(BorderFactory.createTitledBorder(null, "Email", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Verdana",Font.PLAIN,14), Color.decode("#601791")));     
        
        telefoneTextField = new JTextField(10);
        telefoneTextField.setBounds(400,255,320,45);
        telefoneTextField.setBackground(Color.decode("#F5F5F5"));
        telefoneTextField.setFont(verdana);
        telefoneTextField.setBorder(BorderFactory.createTitledBorder(null, "Telefone Celular", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Verdana",Font.PLAIN,14), Color.decode("#601791")));     
        
        // BOTÃO DE ACESSAR ----------------------------------------------------------        
        registerBotao = new JButton("INSCREVER-SE");
        registerBotao.setBounds(400,335,320,24);
        registerBotao.setOpaque(true);
        registerBotao.setBorderPainted(true);
        registerBotao.setBackground(Color.decode("#F5F5F5"));
        registerBotao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // CHECKBOX -------------------------------------------------------------------
        JCheckBox aceitar_Termos = new JCheckBox("Eu li e concordo com os Termos de Uso e Condições.");
        aceitar_Termos.setOpaque(true);
        aceitar_Termos.setBackground(Color.decode("#F5F5F5"));
        aceitar_Termos.setFont(new Font("Verdana", Font.PLAIN,9)); 
        aceitar_Termos.setBounds(400,304,320,24);
        
        // ADICIONAR AS COISAS DENTRO DA INTERFACE ------------------------------------
        //panel.add(f);
        panel.add(labelCriarConta);
        panel.add(labelPequeno);
        panel.add(nomeTextField);
        panel.add(sobrenomeTextField);
        panel.add(emailTextField);
        panel.add(telefoneTextField);
        panel.add(registerBotao);
        panel.add(possui_Conta);
        panel.add(possui_Conta2);
        panel.add(aceitar_Termos);
        panel.add(imagem);

        // ADICIONA O PAINEL NA JANELA -----------------------------------------------
        setContentPane(panel);

        // EXIBIR ELA (JANELA)-----------------------------------------------------------------
        setVisible(true);
    }
    
}
