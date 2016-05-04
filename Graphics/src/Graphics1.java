import java.awt.*;

import javax.swing.*;

public class Graphics1 extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		 
    	public static void main(String[] args) 
    		{
	        Graphics1 canvas = new Graphics1();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	
    	public void paint(Graphics graphics) 
    		{
    		graphics.setColor(Color.black);
    	    graphics.drawLine(1000, 0, 0, 1000);
    	    
    	    graphics.setColor(Color.blue);
	        graphics.fillRect(0, 0, 800, 100);
	        
	        graphics.setColor(Color.red);
	        graphics.drawRect(50, 50, 850, 850);
	        
	        
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(900, 900, 100, 100);
	        
	        graphics.setColor(Color.blue);
	        graphics.drawRect(900, 900, 100, 100);
	        
	        graphics.setColor(Color.gray);
	        graphics.fillOval(100, 300, 250, 250);
	        
	        graphics.setColor(Color.green);
	        graphics.drawOval(100, 300, 250, 250);
	        
	        graphics.setColor(Color.blue);
	        graphics.fillRect(250, 350, 50, 50);
	        
	        graphics.setColor(Color.blue);
	        graphics.fillRect(150, 350, 50, 50);
	        
	        graphics.setColor(Color.red);
	        graphics.fillArc(150, 450, 150, 50, 180, 180);
    		}
	}
