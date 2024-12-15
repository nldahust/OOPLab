package hust.soict.dsai.swing;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class SwingAccumulator extends JFrame {
	
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0; 
	
	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,2));
		cp.add(new Label("Enter an Interger"));
		
		tfInput = new TextField(10);
		cp.add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);
	
		setTitle("AWT Accumulator");
		setSize(350,120);
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		new  SwingAccumulator();

	}
	
	private class TFInputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");

       }
	}
}
