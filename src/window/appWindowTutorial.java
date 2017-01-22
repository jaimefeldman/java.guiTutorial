package window;

import javax.swing.SwingUtilities;

public class appWindowTutorial {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainWindow mainWindow = new MainWindow();
				mainWindow.setVisible(true);
			}
		});
	}
}
