import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Locates the position of a badminton shuttlecock in a confined space using two cameras.
 * 
 * @author thedi
 *
 */
public class Main {
	// class constants
	private static final int WIDTH = 1440;
	private static final int HEIGHT = 540;
	
	/**
	 * Displays a graphical user interface with five video feeds and a basic judging control system.
	 * 
	 * @param argument
	 */
	public static void main(String[] argument)
	{
		// Establish the frame.
        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        // Establish the video feed panel.
        // VideoFeedPanel videoFeedPanel = new VideoFeedPanel(WIDTH, HEIGHT);
        // mainWindow.setContentPane(videoFeedPanel);
        
        // Display the frame.
        mainWindow.pack();
        mainWindow.setVisible(true);
        
	} // end of main(String[] argument)
} // end of class Main
