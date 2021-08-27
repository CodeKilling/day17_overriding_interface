package quiz01;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDateTime;

public class Quiz01_Timer extends Quiz01_RunProcess{

	public String printDay() {
		return String.format("%tF", LocalDateTime.now());
	}

	public String printTime() {
		return String.format("%tT", LocalDateTime.now());
	}

	Frame frame = new Frame("Timer");
	Label label = new Label();
	
	public void setTimer() {
		this.frame.setSize(500, 300);
		this.frame.setVisible(true);
		this.frame.setBackground(new Color(255, 0, 255));

		this.label.setFont(new Font(null, Font.PLAIN, 36));
		this.label.setBounds(100, 100, 300, 100);
		this.label.setAlignment(Label.CENTER);
		this.frame.add(label);
		
		this.frame.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}

	public void run() {
		while (true) {
			this.label.setText(this.printDay() + " " + this.printTime());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
