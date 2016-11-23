import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class TruckTransform extends JApplet 
{
	
	private static Color Dedsec=new Color(0,0,51);
	private static Color Color=new Color(0,0,51);
	private static Color Line=new Color(204, 41, 0);
	private static Color StreetLight=new Color(0, 230, 0);
	private static Color Building=new Color(0, 122, 153);
	private static Color Exhaust=new Color(194, 194, 214);
	private static Color Head=new Color(0, 102, 255);
	private static Color Aqua=new Color(0, 255, 255);
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.getContentPane().add(new TruckTransform());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}

	public void paint(Graphics g)
	{
		try 
		{
	
		int j = 0;

			for(j=0;j<=760;j++)
			{
				if(j>=0 && j<= 680)//Starting FRAME//
				{
				
				g.setColor(Color.darkGray);
				g.fillRect(0, 0, 5000, 5000);//Background//
				
				//Truck Here!//
				//Remember to add + j to x-axis//
				
				}
				
				else if(j>=681 && j<=700)//Flashing FRAME//
				{
					//Flashing Frame HERE!//
					//Remember to change the COLOR!!//
					
					g.setColor(Aqua);
					g.fillRect(0, 0, 5000, 5000);//Background//
				}
				
				else if(j>=701 && j<=735)//Semi Transformation FRAME//
				{
					g.setColor(Color.darkGray);
					g.fillRect(0, 0, 5000, 5000);//Background//
					
					//Semi Transformation HERE!!//
				}
				
				else if(j>=736 && j<=760)//END PHASE FRAME//
				{
					g.setColor(Color.darkGray);
					g.fillRect(0, 0, 5000, 5000);//Background//
					
					//Complete Transformation Here//
				}
				
				Thread.sleep(20);
			}
		
		} 
	
		catch (InterruptedException e) 
		{
		}
	}
}
