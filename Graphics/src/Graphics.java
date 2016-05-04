import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Graphics3 extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		
    	public static void main(String[] args) 
    		{
	        Graphics2 canvas = new Graphics2();
	        JFrame frame = new JFrame();
	        frame.setSize(100, 100);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	
    	public void paint(Graphics graphics) 
    		{
    		for(int a = 0; a <= 255; a = a + 5)
    			{
    			for(int b = 0; b <= 255; b = b + 5)
    				{
    				for(int c = 0; c <= 255; c = c + 5)
    					{
    					graphics.setColor(new Color(a, b, c));
    					delay();
    					}
    				}
    			}
    		}
    	
    	public void delay
    	{
    	try
    	
    	}
	}
    	

