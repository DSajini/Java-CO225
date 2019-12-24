import javax.sound.midi.*;

public class MusicPlayer{
	
	//play method
	public void play(){
		try{
			
			//create a Sequencer (as a music device)
			Sequencer device = MidiSystem.getSequencer();
			device.open();
			
			
			//create a new Sequence
			Sequence seq1 = new Sequence(Sequence.PPQ,4);
			
			//create a track
			Track track = seq1.createTrack();
			
			
			//create midi event
			ShortMessage a = new ShortMessage(); 
			a.setMessage(144, 1, 20, 100); 
			MidiEvent noteOn = new MidiEvent(a, 1); 
			track.add(noteOn); 
			
			ShortMessage b = new ShortMessage(); 
			b. setMessage (144, 1, 102, 100); 
			MidiEvent noteOff = new MidiEvent(b,16);
			track.add(noteOff);
			
			//set the sequence in the sequencer
			device.setSequence (seq1); 
			
			//start the sequencer
			device.start (); 
		}
		
		catch (Exception ex) { 
			ex.printStackTrace (); 
			
		}
	}
	
	//main method
	public static void main(String[] args){
		MusicPlayer mini = new MusicPlayer();
		mini.play();
	}
	
}


		
	