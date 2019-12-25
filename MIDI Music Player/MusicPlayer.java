import javax.sound.midi.*;

public class MusicPlayer{
	
	//play method
	public void play(int instrumentValue,int noteValue){
		try{
			
			//create a Sequencer (as a music device)
			Sequencer device = MidiSystem.getSequencer();
			device.open();
			
			
			//create a new Sequence
			Sequence seq1 = new Sequence(Sequence.PPQ,4);
			
			//create a track
			Track track = seq1.createTrack();
			
			MidiEvent event= null;
			
			//create midi event 
			//change the instrument
			ShortMessage a = new ShortMessage(); 
			a.setMessage(192, 1, instrumentValue, 0); 
			MidiEvent setInstrument = new MidiEvent(a, 1); 
			track.add(setInstrument); 
			
			
			//start the note
			ShortMessage b = new ShortMessage(); 
			b. setMessage (144, 1, noteValue, 100); 
			MidiEvent noteOn = new MidiEvent(b,1);
			track.add(noteOn);
			
			//end the note
			ShortMessage c = new ShortMessage(); 
			c. setMessage (128, 1, noteValue, 100); 
			MidiEvent noteOff = new MidiEvent(c,16);
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
		
		//Handle cmd line arguments
		if(args.length<2){
			System.out.println("Include both instrumet and note as arguments");
		}
		
		else{
			int instrumentValue=Integer.parseInt(args[0]);
			int noteValue=Integer.parseInt(args[1]);
			
			
			mini.play(instrumentValue,noteValue);
		}
	}
	
}


		
	