package TurboXav.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Panel extends JPanel {

	public Panel() {
		
		
		
		/*jCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Fuck");
			}
		});*/
		
		/*JTextField bidon = new JTextField(10);
		this.add(bidon);
		bidon.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyTyped = "+e.getKeyChar());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyReleased = "+e.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyPressed = "+e.getKeyChar());
			}
		});*/
		
		/*jCombo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.print("mouseReleased");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.print("mousePressed");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.print("mouseExited");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.print("mouseEntered");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.print("mouseClicked");
			}
		});*/
	}
	
	
	public void paintComponent(Graphics g) {
		/*g.setColor(Color.WHITE);		
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		Graphics2D G2D = (Graphics2D) g;				
		GradientPaint grad = new GradientPaint(0, 0, Color.BLUE, this.getWidth(),  this.getHeight(), Color.RED);
		G2D.setPaint(grad);
		G2D.fillRect(0, 0, this.getWidth(), this.getHeight());
		
				
		Font f = new Font("Arial",Font.ITALIC,40);
		g.setFont(f);
		g.setColor(Color.BLUE);
		g.drawString("HELLO", 150, 400);
		try {
			BufferedImage image = ImageIO.read(new File("ressources/logo-large.png"));
			g.drawImage(image, 0, 350, this);
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		
		
	}
	
}
