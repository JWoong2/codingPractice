package may.week4.Ex4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx1 extends Frame implements WindowListener {
	Label l;
	public static void main(String[] args) {

		new WindowEventEx1();
		
	}
	
	WindowEventEx1(){
		super("window Event!!");
		addWindowListener(this);
		l = new Label("window Event Test.", Label.CENTER);
		add(l);
		setBounds(300, 300, 300, 300);
		setVisible(true);
		l.setBackground(Color.lightGray);
	}
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		try {
			for(int i=0; i<=255; i++) {
				l.setBackground(new Color(i,i,i));
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		try {
			for(int i=10; i>0; i--) {
				l.setText("시스템 종료합니다 : " + i + "초 남음");
				Thread.sleep(1000);
			}
			l.setText("시스템 종료");
			
			Thread.sleep(2000);
			System.exit(0);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {
		l.setText("최소화 풀림");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		l.setText("최소화");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		setBackground(Color.LIGHT_GRAY);
	}


}
