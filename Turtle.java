import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;

public class Turtle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new First_Scene();
		
//		final JFrame frame = new JFrame();
//		final ImageIcon successIcon = new ImageIcon("successIcon.png");
//		final ImageIcon wall = new ImageIcon("wall.png");
//		final ImageIcon turtle1 = new ImageIcon("1_red.png");
//		final ImageIcon turtle2 = new ImageIcon("2_gold.png");
//		final ImageIcon turtle3 = new ImageIcon("3_green.png");
//		final ImageIcon turtle4 = new ImageIcon("4_blue.png");
//		final ImageIcon turtle5 = new ImageIcon("5_purple.png");
//		final ImageIcon turtle6 = new ImageIcon("6_gray.png");
//		final ImageIcon pacman = new ImageIcon("pacman.png");
//		final ImageIcon enemy = new ImageIcon("enemy.png");
//		final ImageIcon empty = new ImageIcon("empty.png");
//		final ImageIcon bigDot = new ImageIcon("bigDot.png");
//		final ImageIcon smallDot = new ImageIcon("smallDot.png");
//
//		final JButton button = new JButton(successIcon);
//		final JDialog dialog = new JDialog();
//
//		random = new Random();
//
//		dialog.setSize(690,650);
//		dialog.setVisible(false);
//		
//		enemy1H=1;  enemy1W=1;
//		enemy2H=3;  enemy2W=1;
//		enemy3H=5; enemy3W=1; 
//		enemy4H=7; enemy4W=1;
//		enemy5H=9; enemy5W=1;
//		enemy6H=11; enemy6W=1;
//		
//		start=2;  
//		Itemp1=empty; Itemp2=empty; Itemp3=empty; Itemp4=empty; Itemp5=empty; Itemp6=empty;
//		
//		
//		final JLabel[][] f = new JLabel[MAP_SIZE_HEIGHT][MAP_SIZE_WIDTH];
//		
//		for (int i=0; i<MAP_SIZE_HEIGHT; i++) {
//			for(int j=0; j<MAP_SIZE_WIDTH; j++) {
//				f[i][j] = new JLabel();
//			}
//		}
//			
//		class Blistener implements ActionListener {
//			public void actionPerformed(ActionEvent event) {
//				System.exit(0);
//			}
//		}
//
//		class TListener1 implements ActionListener {   //timer클래스 ActionListener
//			public TListener1(int x, int y) {
//				enemy1H = x;
//				enemy1W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(4);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy1H][enemy1W+1].getIcon()).equals(wall) && !(f[enemy1H][enemy1W+1].getIcon()).equals(smallDot) && !(f[enemy1H][enemy1W+1].getIcon()).equals(pacman) && !(f[enemy1H][enemy1W+1].getIcon()).equals(enemy)) {
//							temp1=f[enemy1H][enemy1W+1].getIcon();
//							f[enemy1H][enemy1W+1].setIcon(turtle1);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1W++;
//						}
//						
//						else if(f[enemy1H][enemy1W+1].getIcon().equals(smallDot)) {
//							temp1=f[enemy1H][enemy1W-1].getIcon();
//							f[enemy1H][enemy1W+1].setIcon(empty);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1H = 1;
//							enemy1W = 1;
//							f[enemy1H][enemy1W].setIcon(turtle1);
//						}
//						
//						else if(f[enemy1H][enemy1W+1].getIcon().equals(pacman)) {
//							temp1=f[enemy1H][enemy1W-1].getIcon();
//							f[enemy1H][enemy1W+1].setIcon(empty);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1W = enemy1W + 2;
//							f[enemy1H][enemy1W].setIcon(turtle1);
//						}
//						else if(f[enemy1H][enemy1W+1].getIcon().equals(enemy)) {
//							temp1=f[enemy1H][enemy1W-1].getIcon();
//							f[enemy1H][enemy1W+1].setIcon(empty);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1W--;
//							f[enemy1H][enemy1W].setIcon(turtle1);
//						}
//						break;
//					case 2:
//						if(!(f[enemy1H+1][enemy1W].getIcon()).equals(wall)) {
//							temp1=f[enemy1H+1][enemy1W].getIcon();
//							f[enemy1H+1][enemy1W].setIcon(turtle1);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1H++;
//						}
//						break;
//					case 3:
//						if(!(f[enemy1H-1][enemy1W].getIcon()).equals(wall)) {
//							temp1=f[enemy1H-1][enemy1W].getIcon();
//							f[enemy1H-1][enemy1W].setIcon(turtle1);
//							f[enemy1H][enemy1W].setIcon(Itemp1);
//							Itemp1=temp1;
//							enemy1H--;
//						}
//						break;
//					}
//					
//					/*
//					else if(enemyW==MAP_END) {
//						f[enemyH][enemyW].setIcon(enemy);
//						dialog.add(button);
//						dialog.setVisible(true);
//					}
//					*/				
//				System.out.println(where);
//			}
//			
//		}
//		
//		class TListener2 implements ActionListener {   //timer클래스 ActionListener
//			public TListener2(int x, int y) {
//				enemy2H = x;
//				enemy2W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(2);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy2H][enemy2W+1].getIcon()).equals(wall) && !(f[enemy2H][enemy2W+1].getIcon()).equals(smallDot) && !(f[enemy2H][enemy2W+1].getIcon()).equals(pacman) && !(f[enemy2H][enemy2W+1].getIcon()).equals(enemy)) {
//							temp2=f[enemy2H][enemy2W+1].getIcon();
//							f[enemy2H][enemy2W+1].setIcon(turtle2);
//							f[enemy2H][enemy2W].setIcon(Itemp2);
//							Itemp2=temp2;
//							enemy2W++;
//						}
//						else if(f[enemy2H][enemy2W+1].getIcon().equals(smallDot)) {
//							temp2=f[enemy2H][enemy2W-1].getIcon();
//							f[enemy2H][enemy2W+1].setIcon(empty);
//							f[enemy2H][enemy2W].setIcon(Itemp2);
//							Itemp2=temp2;
//							enemy2H = 3;
//							enemy2W = 1;
//							f[enemy2H][enemy2W].setIcon(turtle2);
//						}
//						
//						else if(f[enemy2H][enemy2W+1].getIcon().equals(pacman)) {
//							temp2=f[enemy2H][enemy2W-1].getIcon();
//							f[enemy2H][enemy2W+1].setIcon(empty);
//							f[enemy2H][enemy2W].setIcon(Itemp2);
//							Itemp2=temp2;
//							enemy2W = enemy2W + 2;
//							f[enemy2H][enemy2W].setIcon(turtle2);
//						}
//						
//						else if(f[enemy2H][enemy2W+1].getIcon().equals(enemy)) {
//							temp2=f[enemy2H][enemy2W-1].getIcon();
//							f[enemy2H][enemy2W+1].setIcon(empty);
//							f[enemy2H][enemy2W].setIcon(Itemp2);
//							Itemp2=temp2;
//							enemy2W--;
//							f[enemy2H][enemy2W].setIcon(turtle2);
//						}
//						break;
//					}	
//				System.out.println(where);
//			}
//		}
//		
//		class TListener3 implements ActionListener {   //timer클래스 ActionListener
//			public TListener3(int x, int y) {
//				enemy3H = x;
//				enemy3W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(2);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy3H][enemy3W+1].getIcon()).equals(wall) && !(f[enemy3H][enemy3W+1].getIcon()).equals(smallDot) && !(f[enemy3H][enemy3W+1].getIcon()).equals(pacman) && !(f[enemy3H][enemy3W+1].getIcon()).equals(enemy)) {
//							temp3=f[enemy3H][enemy3W+1].getIcon();
//							f[enemy3H][enemy3W+1].setIcon(turtle3);
//							f[enemy3H][enemy3W].setIcon(Itemp3);
//							Itemp3=temp3;
//							enemy3W++;
//						}
//						else if(f[enemy3H][enemy3W+1].getIcon().equals(smallDot)) {
//							temp3=f[enemy3H][enemy3W-1].getIcon();
//							f[enemy3H][enemy3W+1].setIcon(empty);
//							f[enemy3H][enemy3W].setIcon(Itemp3);
//							Itemp3=temp3;
//							enemy3H = 5;
//							enemy3W = 1;
//							f[enemy3H][enemy3W].setIcon(turtle3);
//						}
//						
//						else if(f[enemy3H][enemy3W+1].getIcon().equals(pacman)) {
//							temp3=f[enemy3H][enemy3W-1].getIcon();
//							f[enemy3H][enemy3W+1].setIcon(empty);
//							f[enemy3H][enemy3W].setIcon(Itemp3);
//							Itemp3=temp3;
//							enemy3W = enemy3W + 2;
//							f[enemy3H][enemy3W].setIcon(turtle3);
//						}
//						else if(f[enemy3H][enemy3W+1].getIcon().equals(enemy)) {
//							temp3=f[enemy3H][enemy3W-1].getIcon();
//							f[enemy3H][enemy3W+1].setIcon(empty);
//							f[enemy3H][enemy3W].setIcon(Itemp3);
//							Itemp3=temp3;
//							enemy3W--;
//							f[enemy3H][enemy3W].setIcon(turtle3);
//						}
//						break;
//					}	
//				System.out.println(where);
//			}
//		}
//		
//		class TListener4 implements ActionListener {   //timer클래스 ActionListener
//			public TListener4(int x, int y) {
//				enemy4H = x;
//				enemy4W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(2);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy4H][enemy4W+1].getIcon()).equals(wall) && !(f[enemy4H][enemy4W+1].getIcon()).equals(smallDot) && !(f[enemy4H][enemy4W+1].getIcon()).equals(pacman) && !(f[enemy4H][enemy4W+1].getIcon()).equals(enemy)) {
//							temp4=f[enemy4H][enemy4W+1].getIcon();
//							f[enemy4H][enemy4W+1].setIcon(turtle4);
//							f[enemy4H][enemy4W].setIcon(Itemp4);
//							Itemp4=temp4;
//							enemy4W++;
//						}
//						else if(f[enemy4H][enemy4W+1].getIcon().equals(smallDot)) {
//							temp4=f[enemy4H][enemy4W-1].getIcon();
//							f[enemy4H][enemy4W+1].setIcon(empty);
//							f[enemy4H][enemy4W].setIcon(Itemp4);
//							Itemp4=temp4;
//							enemy4H = 7;
//							enemy4W = 1;
//							f[enemy4H][enemy4W].setIcon(turtle4);
//						}
//						
//						else if(f[enemy4H][enemy4W+1].getIcon().equals(pacman)) {
//							temp4=f[enemy4H][enemy4W-1].getIcon();
//							f[enemy4H][enemy4W+1].setIcon(empty);
//							f[enemy4H][enemy4W].setIcon(Itemp4);
//							Itemp4=temp4;
//							enemy4W = enemy4W + 2;
//							f[enemy4H][enemy4W].setIcon(turtle4);
//						}
//						else if(f[enemy4H][enemy4W+1].getIcon().equals(enemy)) {
//							temp4=f[enemy4H][enemy4W-1].getIcon();
//							f[enemy4H][enemy4W+1].setIcon(empty);
//							f[enemy4H][enemy4W].setIcon(Itemp4);
//							Itemp4=temp4;
//							enemy4W--;
//							f[enemy4H][enemy4W].setIcon(turtle4);
//						}
//						break;
//					}	
//				System.out.println(where);
//			}
//		}
//		
//		class TListener5 implements ActionListener {   //timer클래스 ActionListener
//			public TListener5(int x, int y) {
//				enemy5H = x;
//				enemy5W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(2);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy5H][enemy5W+1].getIcon()).equals(wall) && !(f[enemy5H][enemy5W+1].getIcon()).equals(smallDot) && !(f[enemy5H][enemy5W+1].getIcon()).equals(pacman) && !(f[enemy5H][enemy5W+1].getIcon()).equals(enemy)) {
//							temp5=f[enemy5H][enemy5W+1].getIcon();
//							f[enemy5H][enemy5W+1].setIcon(turtle5);
//							f[enemy5H][enemy5W].setIcon(Itemp5);
//							Itemp5=temp5;
//							enemy5W++;
//						}
//						else if(f[enemy5H][enemy5W+1].getIcon().equals(smallDot)) {
//							temp5=f[enemy5H][enemy5W-1].getIcon();
//							f[enemy5H][enemy5W+1].setIcon(empty);
//							f[enemy5H][enemy5W].setIcon(Itemp5);
//							Itemp5=temp5;
//							enemy5H = 9;
//							enemy5W = 1;
//							f[enemy5H][enemy5W].setIcon(turtle5);
//						}
//						
//						else if(f[enemy5H][enemy5W+1].getIcon().equals(pacman)) {
//							temp5=f[enemy5H][enemy5W-1].getIcon();
//							f[enemy5H][enemy5W+1].setIcon(empty);
//							f[enemy5H][enemy5W].setIcon(Itemp5);
//							Itemp5=temp5;
//							enemy5W = enemy5W + 2;
//							f[enemy5H][enemy5W].setIcon(turtle5);
//						}
//						else if(f[enemy5H][enemy5W+1].getIcon().equals(enemy)) {
//							temp5=f[enemy5H][enemy5W-1].getIcon();
//							f[enemy5H][enemy5W+1].setIcon(empty);
//							f[enemy5H][enemy5W].setIcon(Itemp5);
//							Itemp5=temp5;
//							enemy5W--;
//							f[enemy5H][enemy5W].setIcon(turtle5);
//						}
//						break;
//					}	
//				System.out.println(where);
//			}
//		}
//		
//		class TListener6 implements ActionListener {   //timer클래스 ActionListener
//			public TListener6(int x, int y) {
//				enemy6H = x;
//				enemy6W = y;
//			}
//			
//			public void actionPerformed(ActionEvent event)
//			{
//				if(start<=0) where = 1+random.nextInt(2);
//				else { where = 1; start--; }
//					switch(where) {
//					case 1:
//						if(!(f[enemy6H][enemy6W+1].getIcon()).equals(wall) && !(f[enemy6H][enemy6W+1].getIcon()).equals(smallDot) && !(f[enemy6H][enemy6W+1].getIcon()).equals(pacman) && !(f[enemy6H][enemy6W+1].getIcon()).equals(enemy)) {
//							temp6=f[enemy6H][enemy6W+1].getIcon();
//							f[enemy6H][enemy6W+1].setIcon(turtle6);
//							f[enemy6H][enemy6W].setIcon(Itemp6);
//							Itemp6=temp6;
//							enemy6W++;
//						}
//						else if(f[enemy6H][enemy6W+1].getIcon().equals(smallDot)) {
//							temp6=f[enemy6H][enemy6W-1].getIcon();
//							f[enemy6H][enemy6W+1].setIcon(empty);
//							f[enemy6H][enemy6W].setIcon(Itemp6);
//							Itemp6=temp6;
//							enemy6H = 11;
//							enemy6W = 1;
//							f[enemy6H][enemy6W].setIcon(turtle6);
//						}
//						
//						else if(f[enemy6H][enemy6W+1].getIcon().equals(pacman)) {
//							temp6=f[enemy6H][enemy6W-1].getIcon();
//							f[enemy6H][enemy6W+1].setIcon(empty);
//							f[enemy6H][enemy6W].setIcon(Itemp6);
//							Itemp6=temp6;
//							enemy6W = enemy6W + 2;
//							f[enemy6H][enemy6W].setIcon(turtle6);
//						}
//						else if(f[enemy6H][enemy6W+1].getIcon().equals(enemy)) {
//							temp6=f[enemy6H][enemy6W-1].getIcon();
//							f[enemy6H][enemy6W+1].setIcon(empty);
//							f[enemy6H][enemy6W].setIcon(Itemp6);
//							Itemp6=temp6;
//							enemy6W--;
//							f[enemy6H][enemy6W].setIcon(turtle6);
//						}
//						break;
//					}	
//				System.out.println(where);
//			}
//		}
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(new GridLayout(MAP_SIZE_HEIGHT,MAP_SIZE_WIDTH));
//		frame.requestFocus();
//
//		
//
//		for(int i=0; i<MAP_SIZE_HEIGHT; i++) {
//			for(int j=0; j<MAP_SIZE_WIDTH; j++) {
//					f[i][j].setIcon(wall);
//					panel.add(f[i][j]);
//				
//			}
//		}
//		
//		for(int i=1; i<MAP_SIZE_HEIGHT - 1; i++) {
//			for(int j=1; j<MAP_SIZE_WIDTH - 1; j++) {
//					f[i][j].setIcon(empty);
//					frame.add(panel);
//				
//			}
//		}
//		
//		f[enemy1H][enemy1W].setIcon(turtle1);
//		f[enemy2H][enemy2W].setIcon(turtle2);
//		f[enemy3H][enemy3W].setIcon(turtle3);
//		f[enemy4H][enemy4W].setIcon(turtle4);
//		f[enemy5H][enemy5W].setIcon(turtle5);
//		f[enemy6H][enemy6W].setIcon(turtle6);
//		
//		
//		//적 생성 부분 아래에 넣기
//				//장애물 스폰
//				int[][] array = new int[MAP_SIZE_HEIGHT][MAP_SIZE_WIDTH];
//				
//				
//				Random r = new Random();
//				int temp = 0;
//				
//				//장애물을 생성하기 위한 가상 배열 설치
//				for (int i = 1; i < MAP_SIZE_HEIGHT - 1; i++) {
//					for (int j = 3; j < MAP_SIZE_WIDTH - 4; j++) {
//							temp = (int)r.nextInt(100);
//							if (temp >= 0 && temp < 70) {
//								array [i][j] = 0;
//								//Map_s[i][j] = array[i][j];
//							}
//							
//							else if (temp >= 70 && temp < 75) {
//								array [i][j] = 1;
//								//Map_s[i][j] = array[i][j];
//							}
//							
//							else if (temp >= 75 && temp < 85) {
//								array [i][j] = 2;
//								//Map_s[i][j] = array[i][j];
//							}
//							
//							else if (temp >= 85 && temp < 95) {
//								array [i][j] = 3;
//								//Map_s[i][j] = array[i][j];
//							}
//							
//							else if (temp >= 95 && temp < 100) {
//								array [i][j] = 4;
//							}
//					}
//				}
//			
//				//장애물 종류에 따른 다른 장애물 설치
//				for (int i = 1; i < MAP_SIZE_HEIGHT - 1; i++) {
//					for (int j = 3; j < MAP_SIZE_WIDTH - 4; j++) {
//						if (array[i][j] == 0)
//							f[i][j].setIcon(empty);
//						else if (array[i][j] == 1)
//							f[i][j].setIcon(smallDot);
//						else if (array[i][j] == 2)
//							f[i][j].setIcon(pacman);
//						else if (array[i][j] == 3)
//							f[i][j].setIcon(enemy);
//						else if (array[i][j] == 4)
//							f[i][j].setIcon(wall);
//						
//						frame.add(panel);
//					}
//				}
//				
//		for(int i=1; i<MAP_SIZE_HEIGHT - 1; i++) {
//			f[i][MAP_END].setIcon(bigDot);
//		}
//		
//		TListener1 tListener1 = new TListener1(enemy1H,enemy1W);
//		TListener2 tListener2 = new TListener2(enemy2H,enemy2W);
//		TListener3 tListener3 = new TListener3(enemy3H,enemy3W);
//		TListener4 tListener4 = new TListener4(enemy4H,enemy4W);
//		TListener5 tListener5 = new TListener5(enemy5H,enemy5W);
//		TListener6 tListener6 = new TListener6(enemy6H,enemy6W);
//		
//		button.addActionListener(new Blistener());
//		
//		Timer t1 = new Timer(500, tListener1);
//		Timer t2 = new Timer(500, tListener2);
//		Timer t3 = new Timer(500, tListener3);
//		Timer t4 = new Timer(500, tListener4);
//		Timer t5 = new Timer(500, tListener5);
//		Timer t6 = new Timer(500, tListener6);
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		
////		frame.setTitle("TurtleGame");
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		frame.setVisible(true);
////		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private static Random random;
	private static int enemy1H, enemy1W, enemy2H, enemy2W, enemy3H, enemy3W, enemy4H, enemy4W, enemy5H, enemy5W, enemy6H, enemy6W;
	private static int where, start;
	private static Icon temp1, temp2, temp3, temp4, temp5, temp6, Itemp1, Itemp2, Itemp3, Itemp4, Itemp5, Itemp6;

	private static final int FRAME_WIDTH = 990;
	private static final int FRAME_HEIGHT = 650;
	private static final int MAP_SIZE_WIDTH = 20;
	private static final int MAP_SIZE_HEIGHT = 14;
	private static final int MAP_END = MAP_SIZE_WIDTH - 3;
	}