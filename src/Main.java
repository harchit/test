package cp213;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

//---------------------------------------------------------------
/**
 * @author David Brown
 * @version 2019-03-21
 */
public class Main {

    // ---------------------------------------------------------------
    /**
     * @param args Unused.
     */
    public static void main(final String[] args) {
	final JFrame frame = new JFrame("Spawn");
	frame.setLocation(0, 0);
	final SpawnView view = new SpawnView();
	frame.setContentPane(view);
	frame.setSize(SpawnView.SIZE);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(0, 0);
	frame.setVisible(true);
    }
}
