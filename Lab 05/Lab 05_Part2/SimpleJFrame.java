import javax.swing.*;
import java.awt.*;
/**
 * SimpleJFrame - utility class that allows user to easily creates basic visible frame with JComponents
 *
 * @author Izaan Aamir
 * @version 1.00 18/7/2021
 */
public class SimpleJFrame extends JFrame
{
	//constructor
	public SimpleJFrame( String title, JComponent centerComponent )
	{
		this( title, centerComponent, null, null, null, null );
	}

	//constructor
	public SimpleJFrame( String title,
						 JComponent centerComponent,
						 JComponent northComponent, JComponent southComponent,
						 JComponent eastComponent,  JComponent westComponent )
	{
		setTitle( title);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

		if ( centerComponent != null) add( centerComponent, BorderLayout.CENTER);
		if ( northComponent != null)  add( northComponent,  BorderLayout.NORTH);
		if ( southComponent != null)  add( southComponent,  BorderLayout.SOUTH);
		if ( eastComponent != null)   add( eastComponent,   BorderLayout.EAST);
		if ( westComponent != null)   add( westComponent,   BorderLayout.WEST);

		pack();
		setVisible( true);
	}
}