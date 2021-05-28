import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Sample implements ActionListener {
	
	JFrame jf;
	JLabel jl;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divButton;
	JButton clearButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton addButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton minusButton;
   public Sample() {
		
		
		jf=new JFrame("Calculator");
		jf.setBounds(600,150,500,500);
		jf.setLayout(null);
		
		jl=new JLabel("Heyy");
		jl.setBounds(15,10,450,50);
		jl.setBackground(Color.gray);
		jl.setOpaque(true);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(jl);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(80,80,50,50);  
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
	    eightButton=new JButton("8");
		eightButton.setBounds(170,80,50,50); 
		eightButton.addActionListener(this);
		jf.add( eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(260,80,50,50);  
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divButton=new JButton("/");
		divButton.setBounds(350,80,50,50);
		divButton.addActionListener(this);
		jf.add( divButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(420,80,40,50); 
		clearButton.addActionListener(this);
		jf.add( clearButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(80,170,50,50);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(170,170,50,50); 
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(260,170,50,50); 
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multiButton=new JButton("X");
		multiButton.setBounds(350,170,50,50); 
		multiButton.addActionListener(this);
		jf.add( multiButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(80,250,50,50); 
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(170,250,50,50); 
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(260,250,50,50);  
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		addButton=new JButton("+");
		addButton.setBounds(350,250,50,50); 
		addButton.addActionListener(this);
		jf.add( addButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(80,330,50,50);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(170,330,50,50);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(260,330,50,50);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(350,330,50,50);  
		minusButton.addActionListener(this);
		jf.add( minusButton);
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		Sample sf=new Sample();
		
	}


	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			
		}
		
		
	}


	
		
	}


