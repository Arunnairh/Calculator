import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Sample implements ActionListener {
	
	boolean isbuttonclicked=false;
	String oldValue;
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
		
		jl=new JLabel();
		jl.setBounds(15,10,450,50);
		jl.setBackground(Color.gray);
		jl.setOpaque(true);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(jl);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(40,80,50,50);  
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
	    eightButton=new JButton("8");
		eightButton.setBounds(130,80,50,50); 
		eightButton.addActionListener(this);
		jf.add( eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(220,80,50,50);  
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divButton=new JButton("/");
		divButton.setBounds(310,80,50,50);
		divButton.addActionListener(this);
		jf.add( divButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(400,80,50,50); 
		clearButton.addActionListener(this);
		jf.add( clearButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(40,170,50,50);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,170,50,50); 
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(220,170,50,50); 
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multiButton=new JButton("X");
		multiButton.setBounds(310,170,50,50); 
		multiButton.addActionListener(this);
		jf.add( multiButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(40,250,50,50); 
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,250,50,50); 
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(220,250,50,50);  
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		addButton=new JButton("+");
		addButton.setBounds(310,250,50,50); 
		addButton.addActionListener(this);
		jf.add( addButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(40,330,50,50);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,330,50,50);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(220,330,50,50);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(310,330,50,50);  
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
			if(isbuttonclicked) {
				jl.setText("7");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"7");
			}
			
	    }else if(e.getSource()==eightButton){
	    	if(isbuttonclicked) {
				jl.setText("8");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"8");
			}
        }else if(e.getSource()==nineButton){
        	if(isbuttonclicked) {
				jl.setText("9");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"9");
			}
        }else if(e.getSource()==divButton){
        	isbuttonclicked=true;
        	oldValue=jl.getText();
        	
        }else if(e.getSource()==clearButton){
        	String labelText=jl.getText();
	
	        jl.setText("");
	
        }else if(e.getSource()==fourButton){
        	if(isbuttonclicked) {
				jl.setText("4");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"4");
			}
        }else if(e.getSource()==fiveButton){
        	if(isbuttonclicked) {
				jl.setText("5");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"5");
			}
        }else if(e.getSource()==sixButton){
        	if(isbuttonclicked) {
				jl.setText("6");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"6");
			}
        }else if(e.getSource()==multiButton){
        	isbuttonclicked=true;
        	oldValue=jl.getText();
	
        }else if(e.getSource()==oneButton){
        	if(isbuttonclicked) {
				jl.setText("1");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"1");
			}
        }else if(e.getSource()==twoButton){
        	if(isbuttonclicked) {
				jl.setText("2");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"2");
			}
        }else if(e.getSource()==threeButton){
        	if(isbuttonclicked) {
				jl.setText("3");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"3");
			}
        }else if(e.getSource()==addButton){
        	
        	isbuttonclicked=true;
        	oldValue=jl.getText();
        
        }else if(e.getSource()==dotButton){
        	if(isbuttonclicked) {
				jl.setText(".");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+".");
			}
        }else if(e.getSource()==zeroButton){
        	if(isbuttonclicked) {
				jl.setText("0");
				isbuttonclicked=false;
			}else {
				String labelText=jl.getText();
				
				jl.setText(labelText+"0");
			}
        }else if(e.getSource()==equalButton){
        	String newValue=jl.getText();
        	float oldValueF=Float.parseFloat(oldValue);
        	float newValueF=Float.parseFloat(newValue);
        	
        	float result1=(oldValueF+newValueF);
        	jl.setText(result1+"");
        	
        	float result2=(oldValueF-newValueF);
        	jl.setText(result2+"");
        	
        	float result3=(oldValueF*newValueF);
        	jl.setText(result3+"");
        	
        	float result4=(oldValueF/newValueF);
        	jl.setText(result4+"");
        	
        }else if(e.getSource()==minusButton){
        	isbuttonclicked=true;
        	oldValue=jl.getText();
}
		
		
	}


	
		
	}


