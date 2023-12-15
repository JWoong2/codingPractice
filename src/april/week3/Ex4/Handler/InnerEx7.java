package april.week3.Ex4.Handler;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class  InnerEx7{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Start");
		b.addActionListener(new EventHandler() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionEvent occurred!!!");
			}
		});
		
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowHandler() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
			
		});
	}
}

class WindowHandler extends WindowAdapter{@Override
	public void windowClosing(WindowEvent e) {
	System.exit(0);//시스템 종료
}}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}