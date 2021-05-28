import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample {
	
   public Sample() {
		
		
		JFrame jf=new JFrame("Calculator");
		jf.setBounds(300,150,400,400);
		jf.setLayout(null);
		
		JLabel jl=new JLabel("Heyy");
		jl.setBounds(15,10,350,50);
		jl.setBackground(Color.gray);
		jl.setOpaque(true);
		jf.add(jl);
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		Sample sf=new Sample();
		
	}


	
		
	}


