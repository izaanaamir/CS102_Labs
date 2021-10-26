import cs102.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author Izaan Aamir
 * @version 1.00 18/7/2021
 */

public class GUIHangman
{
	//constructor
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView	consoleView;
		TextFieldControlPanel textField;
		NewGameButtonControl buttonControl;
		LabelsHangmanView labels;
		GallowsHangmanView gallowsView;
		HangmanLetterButtonControls buttonControls;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);
		textField = new TextFieldControlPanel(hangman);
		buttonControl = new NewGameButtonControl(hangman);
		labels = new LabelsHangmanView();
		gallowsView = new GallowsHangmanView(hangman);
		buttonControls = new HangmanLetterButtonControls(hangman,13,2);

		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);
		hangman.addView(labels);
		hangman.addView(gallowsView);
		hangman.addView(buttonControl);
		hangman.addView(buttonControls);
		buttonControls.addActionListener(new HangmanLetterButtonsController(hangman));



		SimpleJFrame frame = new SimpleJFrame( "GUIHangman", 	// title
							gallowsView,			// center
							textField, buttonControl,		// north, south
							buttonControls, labels );	// east, west

		// this is an infinite loop reading from the console... not clever!
		//ConsoleControl.controlFor( hangman);
		frame.pack();
	}

	public static void main( String[] args)
	{
		new GUIHangman();

//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//			new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
