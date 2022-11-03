package ARENA;

import javax.swing.*;

//import game_1.Menu_G;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.*;

//import game_1.Game;

public class ARENA extends JPanel {
int score;
int lvl=1;
int end1=0, end=1;
int pos=1;
int epos=1;
int x=-1000, y=-250;
int xp=0, yp=0;
int enx=-50, eny=70;
int ehx=0;
int eatX=4444;
int N=8;
String scoreUP;
Image fon = new ImageIcon("image/fon.jpg").getImage();
Image de10 = new ImageIcon("image/de1.png").getImage();
Image de15 = new ImageIcon("image/de15.png").getImage();
Image pu10 = new ImageIcon("image/pu10.png").getImage();
Image pu15 = new ImageIcon("image/pu15.png").getImage();
Image pu30 = new ImageIcon("image/pu30.png").getImage();
Image pu35 = new ImageIcon("image/pu35.png").getImage();
Image pu20 = new ImageIcon("image/pu20.png").getImage();
Image pu40 = new ImageIcon("image/pu40.png").getImage();
Image pu=pu10;
Image enemy=de10;
Image eh = new ImageIcon("image/h/ehp.png").getImage();Image h0 = new ImageIcon("image/h/h0.png").getImage();Image h1 = new ImageIcon("image/h/h1.png").getImage();Image h2 = new ImageIcon("image/h/h2.png").getImage();Image h3 = new ImageIcon("image/h/h3.png").getImage();Image h4 = new ImageIcon("image/h/h4.png").getImage();Image h5 = new ImageIcon("image/h/h5.png").getImage();Image h6 = new ImageIcon("image/h/h6.png").getImage();Image h7 = new ImageIcon("image/h/h7.png").getImage();Image h8 = new ImageIcon("image/h/h8.png").getImage();
Image hp =h8;
int he=6;

Timer timer_update = null;
Timer enemyA=null;
ARENA(){
	JPanel p1 = new JPanel();
	JLabel counter = new JLabel(scoreUP);
	JFrame frame = new JFrame("MA: SANDS");
	frame.setLayout(null);
	p1.setBounds(0, 0, 50, 20);
	p1.add(counter);
	this.setBounds(0, 0, 1040, 720);
	counter.setBounds(2, 2, 10, 10);
	frame.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_D||e.getKeyCode()==KeyEvent.VK_RIGHT) {
				pos=2;
				x=x-15;
				enx=enx-15;
				if(xp<0){xp=xp+15;}
			}
			if (e.getKeyCode()==KeyEvent.VK_A||e.getKeyCode()==KeyEvent.VK_LEFT) {
				pos=4;
				x=x+15;
				enx=enx+15;
				if(xp>0){xp=xp-15;}
			}
			if (e.getKeyCode()==KeyEvent.VK_W||e.getKeyCode()==KeyEvent.VK_UP) {
				pos=3;
				y=y+15;
				eny=eny+15;
				if(yp>0){yp=yp-15;}
			}
			if (e.getKeyCode()==KeyEvent.VK_S||e.getKeyCode()==KeyEvent.VK_DOWN) {
				pos=1;
				y=y-15;
				eny=eny-15;
				if(yp<0){yp=yp+15;}
			}
			if (e.getKeyCode()==KeyEvent.VK_SPACE) {
				if(pos==3){
					pu=pu35;
				if(((420<=enx)
						&&(enx<=520))
						&&((160<=eny)
						&&(eny<=350))){
						//he=he-1;
						//N = N+1;
						ehx=ehx-1040/he;
						score = score+5;
						String scoreUP = Integer.toString(score);
						counter.setText(scoreUP);
					}
			}
				if(pos==1){
					//pu=pu15;
					/*ActionListener calltimer = new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							if(pos==1){
								pu=pu10;
							}
							if(pos==2){
								pu=pu20;
							}
							if(pos==3){
								pu=pu30;
							}
							if(pos==4){
								pu=pu40;
							}
							repaint();
						}};
						timer_update = new Timer(1000, calltimer);
						timer_update.start();*/
					if(((420<=enx)
							&&(enx<=520))
							&&((320<=eny)
							&&(eny<=420))){
							//enemy=null;
							//N = N+1;
							ehx=ehx-1040/he;
							score = score+5;
							String scoreUP = Integer.toString(score);
							counter.setText(scoreUP);
						}
				}
				repaint();
				}
			if(pos==1){
				pu=pu10;
			}
			if(pos==2){
				pu=pu20;
			}
			if(pos==3){
				pu=pu30;
			}
			if(pos==4){
				pu=pu40;
			}
			if (e.getKeyCode()==KeyEvent.VK_SPACE) {
				if(pos==3){
					pu=pu35;
				if(((420<=enx)
						&&(enx<=520))
						&&((160<=eny)
						&&(eny<=320))){
						//enemy=null;
						//N = N+1;
						//enx=eatX;
						score = score+10;
						String scoreUP = Integer.toString(score);
						counter.setText(scoreUP);
						
					}
			}
				ActionListener calltimer = new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						if(pos==1){
							pu=pu10;
						}
						if(pos==2){
							pu=pu20;
						}
						if(pos==3){
							pu=pu30;
						}
						if(pos==4){
							pu=pu40;
						}
						//if()
						repaint();
						timer_update.stop();
					}};
					timer_update = new Timer(200, calltimer);
					timer_update.start();
				if(pos==1){
					pu=pu15;
							
					if(((420<=enx)
							&&(enx<=520))
							&&((320<=eny)
							&&(eny<=420))){
							//N = N+1;
							//he=he-1;
						ehx=ehx-1040/he;
							score = score+5;
							String scoreUP = Integer.toString(score);
							counter.setText(scoreUP);
						}
				}
				}
			/*ActionListener calltimer = new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					if(pos==1){
						pu=pu10;
					}
					if(pos==2){
						pu=pu20;
					}
					if(pos==3){
						pu=pu30;
					}
					if(pos==4){
						pu=pu40;
					}
					repaint();
				}};
				timer_update = new Timer(1000, calltimer);
				timer_update.start();*/
			if(x>0){
				x = 0;
				enx=enx-15;
				if (e.getKeyCode()==KeyEvent.VK_A||e.getKeyCode()==KeyEvent.VK_LEFT) {
					pos=4;
					xp=xp-15;
				}
			}
			if(xp<-110){
				xp=-110;
				//enx=enx+15;
			}
			if(x<-880){
				x = -880;
				enx=enx+15;
				if (e.getKeyCode()==KeyEvent.VK_D||e.getKeyCode()==KeyEvent.VK_RIGHT) {
					pos=2;
					xp=xp+15;
				}
			}
			if(xp>150){
				xp=150;
				//enx=enx+15;
			}
			if(y<-1190){
				y = -1190;
				eny=eny+15;
				if (e.getKeyCode()==KeyEvent.VK_S||e.getKeyCode()==KeyEvent.VK_DOWN) {
					pos=2;
					yp=yp+15;
				}
			}
			if(yp>100){
				yp=100;
				//enx=enx+15;
			}
			if(y>0){
				y = 0;
				eny=eny-15;
				if (e.getKeyCode()==KeyEvent.VK_W||e.getKeyCode()==KeyEvent.VK_UP) {
					pos=2;
					yp=yp-15;
				}
			}
			if(yp<-40){
				yp=-40;
				//enx=enx+15;
			}
			//////////////////////////////////////////////////////////////////////////////////////////
			if(ehx<-1040){
				enemy=null;
				enx=eatX;
				lvl=lvl+1;
			}
			if(lvl==2){
				enemy=de10;
				enx=x+700; eny=y+500;
				ehx=0;
			}
			/////////////////////////////////////////////////////////////////////////////////////////
			repaint();
		}
	});
	frame.setLocationRelativeTo(null);
	frame.getContentPane().add(p1);
	frame.getContentPane().add(this);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setLocation(350,150);
	frame.setMinimumSize(new Dimension(1040,770));
	
	ActionListener ATAKA = new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			if(((enx-50<=470)
					&&(470<=enx+100))
					&&((eny-30<=230)
					&&(230<=eny+70))){
					N=N-1;
					enemy=de15;
					score = score-50;
					if(score<0){score=0;}
					String scoreUP = Integer.toString(score);
					counter.setText(scoreUP);
				}
			if(N==0){hp=h0; end1=end; 
			if(end1 == end){
				JOptionPane.showMessageDialog(null,score);
				};
			if(end1 == end){
				Menu go = new Menu();
				frame.setVisible(false);
			}} if(N==1){hp=h1;} if(N==2){hp=h2;} if(N==3){hp=h3;} if(N==4){hp=h4;} if(N==5){hp=h5;} if(N==6){hp=h6;} if(N==7){hp=h7;} if(N==8){hp=h8;}
			repaint();
		}};
		enemyA = new Timer(1000, ATAKA);
		enemyA.start();
}
public void timer(){
	this.repaint();
}
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(fon, x, y, null);
	g.drawImage(enemy, enx, eny, null);
	
	g.drawImage(pu, xp, yp, null);
	g.drawImage(hp, 0, 0, null);
	g.drawImage(eh, ehx, 0, null);
	
}
public static void main(String[] args) {
	ARENA run = new ARENA();
	run.repaint();
}
}