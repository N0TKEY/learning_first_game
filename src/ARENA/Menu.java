package ARENA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel{
	 //private int pogoda=1;
	
	Image fon = new ImageIcon("image/Mfon.png").getImage();
	//Image fon;
	int t;
	Menu(){
		JPanel c1 = new JPanel();
		
		JFrame frame = new JFrame("Menu");
		JButton run = new JButton("Начать игру");
		JButton close = new JButton("Закрыть игру");
		//JButton snow = new JButton("Зима");
		//JButton sun = new JButton("Лето");
		
		frame.setLayout(null);			
		c1.setBounds(700, 50, 300, 20);
		this.setBounds(0, 0, 1040, 720);
		
		this.setLayout(null);
		run.setBounds(700, 250, 300, 70);//150, 70
		close.setBounds(700, 550, 300, 70);
		//snow.setBounds(700, 470, 140, 50);
		//sun.setBounds(860, 470, 140, 50);
		this.add(run);
		this.add(close);
		//this.add(snow);
		//this.add(sun);
		JLabel counter = new JLabel("0");
		c1.add(counter);
		counter.setBounds(700, 50, 300, 20);
		
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(c1);
		frame.getContentPane().add(this);
		//Game game = new Game(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(350, 150);
		frame.setMinimumSize(new Dimension(1040, 770));
		
		run.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ARENA go = new ARENA();
				frame.setVisible(false);
				
			}
		});
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
				
			}
		});
		/*snow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pogoda=1;
				fon = Start_FonS;
				game.fon = game.imgFonS;
				game.pogoda = 0;
				game.img = game.catS;
				repaint();
			}
		});
		sun.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pogoda=0;
				fon = Start_Fon;
				//game.fon = game.imgFon;
				//game.pogoda = 1;
				//game.img = game.cat;
				repaint();
			}
		});
		if(pogoda==1){
			fon = Start_FonS;
		}
		if(pogoda==0){
			fon = Start_Fon;
		}*/
		this.repaint();
		
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(fon, 0, 0, null);
	}
	
public static void main(String[] args){
	Menu go = new Menu();
	go.repaint();
	
	}
}
