import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGUI implements ActionListener {
	
	JButton b1;
	public void create(){
		//create a JFrame and a Button
		JFrame frame = new JFrame();
		b1 = new JButton("Click");
		
		
		
		//add action listener to button
		b1.addActionListener(this);
		
		
		//add the button to content pane of window
		frame.getContentPane().add(BorderLayout.SOUTH,b1);
		
		//set the size of window
		frame.setSize(450,300);
		
		//make the window visible
		frame.setVisible(true);
		
		//Close operation on window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		FirstGUI mygui = new FirstGUI();
		mygui.create();
	}
	
	public void actionPerformed(ActionEvent event){
		b1.setText("CLICKED");
	}
	
	
}