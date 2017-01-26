package window;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private TextPanel textPanel;
	private ToolBar	  toolBar;
	
	public MainWindow() {
		
		setTitle("Window Tutorial");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		textPanel	= new TextPanel();
		toolBar		= new ToolBar();
		
		toolBar.setTextPanel(textPanel);
	
		add(textPanel, BorderLayout.CENTER);
		add(toolBar, BorderLayout.NORTH);

		setLocationRelativeTo(null);

	}

}
