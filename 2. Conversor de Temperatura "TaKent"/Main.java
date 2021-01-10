import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Interface.ImagesUtil;

public class Main extends JFrame {

    private JTextField campo1, campo2, campo3;
    private JLabel label1, label2, label3;
    
    Font lato = new Font("Lato", Font.PLAIN,22);
    
    public Main() {
        
        // CONFIGS DA TEL
        setTitle("Conversor de Temperatura");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(427,696);
        setResizable(false);
        
    	// PANEL CRIADO E MODIFICADO
    	JPanel panel = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                   final int R = 100;
                   final int G = 100;
                   final int B = 100;                
                   Paint p =
                      new GradientPaint(0.0f, 0.0f, (Color.decode("#C69D6E")),
                      getWidth(), getHeight(), (Color.decode("#E1B787")), true);
                   Graphics2D g2d = (Graphics2D)g;
                   g2d.setPaint(p);
                   g2d.fillRect(0, 0, getWidth(), getHeight());
                } else {
                   super.paintComponent(g);
                }
             }
          };
        panel.setLayout(null);
        panel.setBackground(Color.decode("#C69D6E"));
        
        // A IMAGEM               
        	//setBounds(left, top, width, height);
        
        JLabel takent = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/takent.png"),172,56));
        takent.setBounds(80, -55, 256, 253);
        
        JLabel yancosta = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/yancosta.png"),427,37));
        yancosta.setBounds(-11, 622, 427, 37);
        
        JLabel imagem = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/coffee-beans.png"),256,253));
        imagem.setBounds(189, 450, 256, 253);
        
        JLabel imagem2 = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/coffee-beans2.png"),256,253));
        imagem2.setBounds(-50, 450, 256, 253);
        
        JLabel imagem3 = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/coffee-beans4.png"),256,253));
        imagem3.setBounds(-50, -50, 256, 253);
        
        JLabel imagem4 = new JLabel(ImagesUtil.scaleImage(new ImageIcon("C:/Users/yan/eclipse-workspace/aulas/src/Interface_2/coffee-beans5.png"),256,253));
        imagem4.setBounds(-180, 150, 256, 253);
        
        // TEXTOS
        	//setBounds(left, top, width, height);
        
        JLabel label1 = new JLabel("Celsius");
        label1.setBounds(176, 118, 136, 24);
        label1.setFont(lato); 
        label1.setForeground(Color.decode("#221F1F"));
        
        JLabel label2 = new JLabel("Fahrenheit");
        label2.setBounds(153, 255, 136, 24);
        label2.setFont(lato); 
        label2.setForeground(Color.decode("#221F1F"));
        
        JLabel label3 = new JLabel("Kelvin");
        label3.setBounds(176, 390, 136, 24);
        label3.setFont(lato); 
        label3.setForeground(Color.decode("#221F1F"));
        
        // CAMPOS DE DIGITAÇÃO
        	//setBounds(x, y, width, height);
        campo1 = new JTextField(270);
        campo1.setBounds(74,142,273,72);
        campo1.setBackground(Color.decode("#E6E2D3"));
        campo1.setFont(lato);
        campo1.setBorder(BorderFactory.createLineBorder(Color.decode("#523C24")));
        campo1.setHorizontalAlignment(JTextField.CENTER);
        
        campo2 = new JTextField(270);
        campo2.setBounds(74,279,273,72);
        campo2.setBackground(Color.decode("#E6E2D3"));
        campo2.setFont(lato);
        campo2.setBorder(BorderFactory.createLineBorder(Color.decode("#523C24")));
        campo2.setHorizontalAlignment(JTextField.CENTER);

        
        campo3 = new JTextField(270);
        campo3.setBounds(74,413,273,72);
        campo3.setBackground(Color.decode("#E6E2D3"));
        campo3.setFont(lato);
        campo3.setBorder(BorderFactory.createLineBorder(Color.decode("#523C24")));
        campo3.setHorizontalAlignment(JTextField.CENTER);


        // CAMPO DO CELSIUS
        campo1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {

            }
            @Override
            public void keyPressed(KeyEvent event) {
            	
            }
            @Override
            public void keyReleased(KeyEvent event) {
            	//campo2.setText(campo1.getText());
            	
            	int tempCelc = (int) ((Double.parseDouble(campo1.getText())));
                campo1.setText(tempCelc + ""); 
            	
            	int tempFahr = (int) ((Double.parseDouble(campo1.getText())) * 1.8 + 32);
                campo2.setText(tempFahr + ""); 
                
                int tempKelv = (int) ((Double.parseDouble(campo1.getText())) + 273.15);
                campo3.setText(tempKelv + ""); 
            }
        });
        
        // CAMPO DO FAHR
        campo2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {

            }
            @Override
            public void keyPressed(KeyEvent event) {
            	
            }
            @Override
            public void keyReleased(KeyEvent event) {
            	
            	int tempFahr = (int) ((Double.parseDouble(campo2.getText())));
                campo2.setText(tempFahr + ""); 
            	
            	int tempCelc = (int) ((Double.parseDouble(campo2.getText())) - 32 * 1.8);
                campo1.setText(tempCelc + ""); 
                
                int tempKelv = (int) ((Double.parseDouble(campo2.getText())) + - 32 * 1.8 + 273.15);
                campo3.setText(tempKelv + ""); 
            }
        });
        
        // CAMPO DO KELVIN
        campo3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {

            }
            @Override
            public void keyPressed(KeyEvent event) {
            	
            }
            @Override
            public void keyReleased(KeyEvent event) {
            	
            	int tempKelv = (int) ((Double.parseDouble(campo3.getText())));
                campo3.setText(tempKelv + ""); 
            	
            	int tempCelc = (int) ((Double.parseDouble(campo3.getText())) - 273.15);
                campo1.setText(tempCelc + ""); 
                
                int tempFahr = (int) ((Double.parseDouble(campo3.getText())) - 273.15  * 1.8 + 32);
                campo2.setText(tempFahr + ""); 
            }
        });
        
        // ADICIONAR NO PANEL
        panel.add(campo1);
        panel.add(campo2);
        panel.add(campo3);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(yancosta);
        panel.add(takent);
        panel.add(imagem);
        panel.add(imagem2);
        panel.add(imagem3);
        panel.add(imagem4);
        
        // ADICIONA O PAINEL NA JANELA
        setContentPane(panel);

        // EXIBIR ELA (JANELA)
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new Main();
    }
    
}
