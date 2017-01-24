package window;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private TextArea textAria;
	private JButton  clickButton;
	
	public MainWindow() {
		
		setTitle("Window Tutorial");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		textAria 	= new TextArea();
		clickButton = new JButton("click me");
		clickButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textAria.append("Click!\n");
			}
		});
		
		add(textAria, BorderLayout.CENTER);
		add(clickButton,  BorderLayout.SOUTH);

		setLocationRelativeTo(null);

	}

}
