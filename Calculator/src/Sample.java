import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Sample {
	
   public Sample() {
		
		
		JFrame jf=new JFrame("Calculator");
		jf.setBounds(600,150,500,500);
		jf.setLayout(null);
		
		JLabel jl=new JLabel("Heyy");
		jl.setBounds(15,10,450,50);
		jl.setBackground(Color.gray);
		jl.setOpaque(true);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(jl);
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(80,80,50,50);  
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		 eightButton.setBounds(170,80,50,50);  
		jf.add( eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(260,80,50,50);  
		jf.add(nineButton);
		
		JButton divButton=new JButton("/");
		 divButton.setBounds(350,80,50,50);  
		jf.add( divButton);
		
		JButton clearButton=new JButton("C");
		clearButton.setBounds(420,80,40,50);  
		jf.add( clearButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(80,170,50,50);  
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(170,170,50,50);  
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(260,170,50,50);  
		jf.add(sixButton);
		
		JButton multiButton=new JButton("X");
		multiButton.setBounds(350,170,50,50);  
		jf.add( multiButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(80,250,50,50);  
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(170,250,50,50);  
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(260,250,50,50);  
		jf.add(threeButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(350,250,50,50);  
		jf.add( addButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(80,330,50,50);  
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(170,330,50,50);  
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(260,330,50,50);  
		jf.add(equalButton);
		
		JButton minusButton=new JButton("-");
		minusButton.setBounds(350,330,50,50);  
		jf.add( minusButton);
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		Sample sf=new Sample();
		
	}


	
		
	}


