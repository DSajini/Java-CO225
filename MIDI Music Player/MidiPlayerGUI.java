import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MidiPlayerGUI {
	
	
	public void createGUI(){
		
		
		//list of instruments and their numbers
		String[] instrumentName = {"Bright Acoustic Piano", "Xylophone","Church Organ","Acoustic Guitar","Electric Guitar","Electric Bass","Violin","Cello","Voice Oohs","Soprano Sax","Oboe","Flute","	Pad 4(choir)","FX 3(crystal)","FX 7(echoes)","Banjo"};
		
		int[] instrumentNo = {2,14,20,26,28,35,41,43,54,65,69,74,92,99,103,106};
		
		//create a JFrame 
		JFrame frame = new JFrame("MIDI Player");
		
		
		
		//create necessary JPanel
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		
		
		
		

		//set layouts to panels
		leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
		rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));
		centerPanel.setLayout(new GridLayout(16,16));
		
		//set Borders in panels
		leftPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		rightPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		centerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
		
		
		
		// add check boxes
		for(int i=0;i<256;i++){
				JCheckBox c1 = new JCheckBox();
				centerPanel.add(c1);
		}
		
		
		//add instrument buttons
		for(int i=0;i<16;i++){
				Button b1 = new Button(instrumentName[i]);
				rightPanel.add(b1);
		}
		
		// add player buttons
		
				Button b1 = new Button("	Start	");
				leftPanel.add(b1);
		
				Button b2 = new Button("	Stop	");
				leftPanel.add(b2);
		
		
		
		
		

		//add panels to the final frame 
		frame.getContentPane().add(BorderLayout.EAST,leftPanel);
		frame.getContentPane().add(BorderLayout.WEST,rightPanel);
		frame.getContentPane().add(BorderLayout.CENTER,centerPanel);
	
		
		//Display the window
		frame.setBounds(100,100,600,600);
		frame.pack();
		
		
		
		
		frame.setVisible(true);
		
		//Close operation on window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		MidiPlayerGUI player = new MidiPlayerGUI();
		player.createGUI();
	}
	
	
	
}