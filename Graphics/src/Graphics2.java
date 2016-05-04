import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Graphics2 extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		
		static int width;
		static int option;
		
    	public static void main(String[] args) 
    		{
    		Scanner userInput = new Scanner(System.in);
        	Scanner userInput2 = new Scanner(System.in);
        	System.out.println("How wide would you like me to draw a square between 100 and 500 pixels?");
        	width = userInput.nextInt(); 
        	System.out.println("Would you like for your Square to be Red or Blue? ");
        	System.out.println("Please input:");
        	System.out.println("1 for Red");
        	System.out.println("2 for Blue");
        	option = userInput2.nextInt();
        		
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
    		
    		if(option == 1)
    			{
    			graphics.setColor(Color.red);	
    	    	graphics.fillRect(250, 250, width, width);
    			}
    		if(option == 2)
    			{
    			graphics.setColor(Color.blue);	
    	    	graphics.fillRect(250, 250, width, width);
    			}
    	
    		
    		}
	}
