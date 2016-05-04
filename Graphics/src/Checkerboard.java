import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Checkerboard extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		static boolean color = true;
		
    	public static void main(String[] args) 
    		{
	        Graphics2 canvas = new Graphics2();
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
    		for(int r = 0; r <= 800; r = r + 100)
    			{
    			for(int c = 0; c <= 800; c = c + 100)
    				{
    				if(color == true)
    					{
    					graphics.setColor(Color.black);
    					graphics.fillRect(r, c, 100, 100);
    					color = false;
    					}
    				else if(color == false)
    					{
    					graphics.setColor(Color.white);
        				graphics.fillRect(r, c, 100, 100);
        				color = true;
    					}
    				}
    			}
    		graphics.setColor(Color.black);
    		graphics.drawRect(0, 0, 800, 800);
    		}
	}
